package by.bsu.library;


import java.sql.*;

public class Main {
    public static void main(String[] args) throws SQLException {
        Connection connection= DriverManager
                .getConnection("jdbc:mysql://localhost:3306/java","root","sqlmgr");

        Statement statement=connection.createStatement();
        ResultSet resultSet=statement.executeQuery("select id,name from user ");

        while (resultSet.next()){
            System.out.println(resultSet.getInt("id"));
            System.out.println(resultSet.getString("name"));
        }
    }
}
