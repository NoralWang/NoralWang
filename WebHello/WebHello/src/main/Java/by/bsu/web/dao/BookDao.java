package by.bsu.web.dao;

import by.bsu.web.entity.Book;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class BookDao {
    public Book findById(int id)throws SQLException {
        connectionFactory factory = new connectionFactory();
        Connection connection = factory.create();

        PreparedStatement statement = connection.
                prepareStatement("select book_id, name from book where book_id =?");
        statement.setInt(1,id);
        ResultSet resultSet = statement.executeQuery();

        List<Book> books=map(resultSet);
        return books.size() ==1?books.get(0):null;
    }

    public  List<Book> findAll() throws SQLException {
        connectionFactory factory =new connectionFactory();
        try(Connection connection =factory.create()) {
            PreparedStatement statement = connection.prepareStatement("select book_id,name,publish_year,author,location_id,GENRE_ID,description from book");
            ResultSet resultSet = statement.executeQuery();
            return  map(resultSet);
        }
    }

    public void save (Book book) throws ClassNotFoundException,SQLException{
        connectionFactory factory =new connectionFactory();
        Connection connection = factory.create();
        PreparedStatement statement=connection.prepareStatement("insert into book(name,PUBLISH_YEAR,AUTHOR,LOCATION_ID,GENRE_ID,DESCRIPTION) values (?,?,?,?,?,?)");
        statement.setString(1, book.getName());
        statement.setString(2, book.getPublish_Year());
        statement.setString(3, book.getAuthor());
        statement.setString(4, book.getLocation_ID());
        statement.setString(5, book.getGENRE_ID());
        statement.setString(6, book.getDescription());
        statement.executeUpdate();
    }


    private List<Book> map(ResultSet resultSet) throws SQLException {
        List<Book> books = new ArrayList<>();
        while (resultSet.next()) {
            String book_id = resultSet.getString("book_id");
            String name = resultSet.getString("name");
            String publish_year=resultSet.getString("publish_Year");
            String author= resultSet.getString("author");
            String location_ID=resultSet.getString("location_ID");
            String GENRE_ID=resultSet.getString("genre_id");
            String description=resultSet.getString("description");
            Book book = new Book(book_id ,name,publish_year,author,location_ID,GENRE_ID,description);
            books.add(book);
        }
        return books;
    }
}

