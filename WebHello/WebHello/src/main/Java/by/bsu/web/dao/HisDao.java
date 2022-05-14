package by.bsu.web.dao;

import by.bsu.web.entity.History;
import by.bsu.web.entity.User;
import by.bsu.web.entity.addUser;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class HisDao {
    public List<History> findall(int id) throws SQLException {
        connectionFactory factory =new connectionFactory();
        try(Connection connection =factory.create()) {
            if (id==2122){
                PreparedStatement statement = connection.prepareStatement("select * from history \n" +
                        "LEFT JOIN book\n" +
                        "on book.BOOK_ID=history.BOOK_ID");
                ResultSet resultSet = statement.executeQuery();
                System.out.println("login2"+id);
                return  mapuser(resultSet);

            }

            else{
                System.out.println("login3"+id);
                PreparedStatement statement = connection.prepareStatement("select * from history \n" +
                        "LEFT JOIN book\n" +
                        "on book.BOOK_ID=history.BOOK_ID\n" +
                        "and history.borr_userid=?");
                statement.setInt(1, id);
                ResultSet resultSet = statement.executeQuery();
                return  mapuser(resultSet);
            }
        }
    }

    private List<History> mapuser(ResultSet resultSet) throws SQLException {
        List<History> History = new ArrayList<>();
        while (resultSet.next()) {
            int book_id = Integer.parseInt(resultSet.getString("book_id"));
            System.out.println("id"+book_id);
            String name = resultSet.getString("name");
            System.out.println("name"+name);
            String LOCATION_ID = resultSet.getString("LOCATION_ID");
            System.out.println("LOCATION_ID"+LOCATION_ID);
            String AUTHOR = resultSet.getString("AUTHOR");
            System.out.println("AUTHOR"+AUTHOR);
            String borr_time = resultSet.getString("borr_time");
            System.out.println("borr_time"+borr_time);
            String borr_userid = resultSet.getString("borr_userid");
            String borr_username = resultSet.getString("borr_username");
            String return_time = resultSet.getString("return_time");
            History his = new History(book_id,name,LOCATION_ID,AUTHOR,borr_time,borr_userid,borr_username,return_time);
            History.add(his);
        }
        return History;
    }

}
