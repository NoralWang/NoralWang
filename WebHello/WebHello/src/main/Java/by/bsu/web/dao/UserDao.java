package by.bsu.web.dao;

import by.bsu.web.entity.Book;
import by.bsu.web.entity.User;
import by.bsu.web.entity.addUser;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserDao {
    public List<addUser> findall() throws SQLException {
        connectionFactory factory = new connectionFactory();
        try (Connection connection = factory.create()) {
            PreparedStatement statement = connection.prepareStatement("select id,name,surname,login,password,is_admin,picture from user");
            ResultSet resultSet = statement.executeQuery();
            return mapuser(resultSet);
        }
    }

    public addUser findById(int id) throws SQLException {
        connectionFactory factory = new connectionFactory();
        Connection connection = factory.create();
        PreparedStatement statement = connection.
                prepareStatement("select * from user where id =?");
        statement.setInt(1, id);
        ResultSet resultSet = statement.executeQuery();
        List<addUser> adduser = mapuser(resultSet);
        return adduser.size() == 1 ? adduser.get(0) : null;
    }


    public  List<addUser> selectUser(String name, String userid ) throws SQLException {
        connectionFactory factory =new connectionFactory();
        try(Connection connection =factory.create()) {
            String sql="select * from user";
            if (name!=""&& userid!=""){
                sql +=" where name LIKE '%' ? '%' and id LIKE '%' ? '%'";
            }
            else if (name==""&& userid!=""){
                sql += " where id LIKE '%' ? '%'";
            }
            else if (name!=""&& userid==""){
                sql += " where name LIKE '%' ? '%' ";
            }
            else{
                sql += " where name <> '' and id <> ''";
            }
            PreparedStatement statement = connection.prepareStatement(sql);
            if (name!=""&& userid!=""){
                statement.setString(1, name);
                statement.setString(2, userid);
            }
            else if (name==""&& userid!=""){
                statement.setString(1, userid);
            }
            else if (name!=""&& userid==""){
                statement.setString(1, name);
            }

            ResultSet resultSet = statement.executeQuery();
            return  mapuser(resultSet);
        }
    }

    public void save (addUser user) throws ClassNotFoundException, SQLException {
        connectionFactory factory =new connectionFactory();
        Connection con = factory.create();
        PreparedStatement st=con.prepareStatement("INSERT INTO user (NAME,SURNAME,LOGIN,PASSWORD,IS_ADMIN,picture) VALUES (?,?,?,?,?,?)");
        st.setString(1, user.getName());
        st.setString(2, user.getSurname());
        st.setString(3, user.getLoginac());
        st.setString(4, user.getPassword());
        st.setInt(5, user.getIs_admin());
        st.setString(6, user.getPicture());
        st.executeUpdate();
    }

    public void update (int id,addUser user) throws ClassNotFoundException, SQLException {
        connectionFactory factory =new connectionFactory();
        Connection con = factory.create();
        PreparedStatement st=con.prepareStatement("UPDATE user SET NAME=?,SURNAME=?,LOGIN=?,PASSWORD=?,IS_ADMIN=?,PICTURE=? WHERE id= ?");
        st.setString(1, user.getName());
        st.setString(2, user.getSurname());
        st.setString(3, user.getLoginac());
        st.setString(4, user.getPassword());
        st.setInt(5, user.getIs_admin());
        st.setString(6, user.getPicture());
        st.setInt(7, id);
        st.executeUpdate();
    }


    private List<addUser> mapuser(ResultSet resultSet) throws SQLException {
        List<addUser> adduser = new ArrayList<>();
        while (resultSet.next()) {
            int id = Integer.parseInt(resultSet.getString("id"));
            String name = resultSet.getString("name");
            String surname = resultSet.getString("surname");
            String login = resultSet.getString("login");
            String password = resultSet.getString("password");
            int is_admin = resultSet.getInt("is_admin");
            String picture = resultSet.getString("picture");
            addUser users = new addUser(id,name,surname,login,password,is_admin,picture);
            adduser.add(users);
        }
        return adduser;
    }


    public User login(String login, String password) throws SQLException, ClassNotFoundException {

        connectionFactory factory = new connectionFactory();
        Connection connection = factory.create();
        Class.forName("com.mysql.jdbc.Driver");
        PreparedStatement statement = connection.prepareStatement
                ("select id,name,is_admin,picture from user  where login =? and password =?");
        statement.setString(1, login);
        statement.setString(2, password);
        ResultSet resultSet = statement.executeQuery();

        if(resultSet.next()){
            return new User(resultSet.getInt("id"),
                    resultSet.getString("name"),
                    resultSet.getInt("is_admin"),
                    resultSet.getString("picture"));
        }
        else{
            return null;
        }
    }

}
