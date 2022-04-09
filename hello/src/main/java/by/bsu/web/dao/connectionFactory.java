package by.bsu.web.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    private final static String  DRIVER="com.mysql.jdbc.Driver";
    private final static String  CONNECTION_STRING="jdbc:mysql://localhost:3306/pay_ment";
    private final static String  USER="root";
    private final static String  PASSWORD="guoxiaojian123";

    static {
        try{
            Class.forName(DRIVER);
        }catch (ClassNotFoundException e){
            throw new RuntimeException(e);
        }
    }


    public Connection create() throws SQLException {
        Connection  connection= DriverManager.getConnection(CONNECTION_STRING,USER,PASSWORD);
        return  connection;
    }



}
