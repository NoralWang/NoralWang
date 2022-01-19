package by.bsu.web.dao;

import by.bsu.web.entity.User;

import java.sql.*;

public class UserDao {
    public User login(String login, String password) throws SQLException, ClassNotFoundException {

        connectionFactory factory = new connectionFactory();
        Connection connection = factory.create();
        Class.forName("com.mysql.cj.jdbc.Driver");
//        Connection connection= DriverManager
//                .getConnection("jdbc:mysql://localhost:3306/java","root","sqlmgr");

        PreparedStatement statement = connection.prepareStatement
                ("select id,name,is_admin from user  where login =? and password =?");
        statement.setString(1, login);
        statement.setString(2, password);
        ResultSet resultSet = statement.executeQuery();

        if(resultSet.next()){
            return new User(resultSet.getInt("id"),
                    resultSet.getString("name"),
                    resultSet.getBoolean("is_admin"));
        }
        return  null;

    }

}
