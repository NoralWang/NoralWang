package by.bsu.web.dao;

import by.bsu.web.entity.Book;

import by.bsu.web.entity.addUser;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AddUserDao {
    public  List<addUser> findAll() throws SQLException {
        connectionFactory factory =new connectionFactory();
        try(Connection connection =factory.create()) {
            PreparedStatement statement = connection.prepareStatement("select name,surname,login,password,is_admin from user");
            ResultSet resultSet = statement.executeQuery();
            return  mapuser(resultSet);
        }
    }

    public void save (addUser user) throws ClassNotFoundException, SQLException {
        connectionFactory factory =new connectionFactory();
        Connection con = factory.create();
        PreparedStatement st=con.prepareStatement("INSERT INTO user (NAME,SURNAME,LOGIN,PASSWORD,IS_ADMIN) VALUES (?,?,?,?,?)");
        st.setString(1, user.getName());
        st.setString(2, user.getSurname());
        st.setString(3, user.getLogin());
        st.setString(4, user.getPassword());
        st.setString(5, String.valueOf(user.getAdmin()));
        st.executeUpdate();
    }


    private List<addUser> mapuser(ResultSet resultSet) throws SQLException {
        List<addUser> adduser = new ArrayList<>();
        while (resultSet.next()) {
            String name = resultSet.getString("name");
            String surname = resultSet.getString("surname");
            String login = resultSet.getString("login");
            String password = resultSet.getString("password");
            addUser users = new addUser(name,surname,login,password,0);
            adduser.add(users);
        }
        return adduser;
    }
}
