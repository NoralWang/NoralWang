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
    public void save (addUser user) throws ClassNotFoundException, SQLException {
        connectionFactory factory =new connectionFactory();
        Connection con = factory.create();
        PreparedStatement st=con.prepareStatement("INSERT INTO user (NAME,SURNAME,LOGIN,PASSWORD,IS_ADMIN VALUES ('?','?','?','?')");
       // st.setString(1, user.getName());
        st.executeUpdate();
    }


    private List<addUser> map(ResultSet resultSet) throws SQLException {
        List<addUser> adduser = new ArrayList<>();
        while (resultSet.next()) {
            String name = resultSet.getString("name");
            String surname = resultSet.getString("surname");
            String login = resultSet.getString("login");
            String password = resultSet.getString("passsword");
            addUser users = new addUser(name,surname,login,password,null);
            adduser.add(users);
        }
        return adduser;
    }
}
