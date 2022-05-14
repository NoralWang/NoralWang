package by.bsu.web.dao;

import by.bsu.web.entity.Book;

import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class BookDao {
    public Book findById(int book_id)throws SQLException {
        connectionFactory factory = new connectionFactory();
        Connection connection = factory.create();
        PreparedStatement statement = connection.
                prepareStatement("select * from book where book_id =?");
        statement.setInt(1,book_id);
        ResultSet resultSet = statement.executeQuery();
        List<Book> books=map(resultSet);
        return books.size() ==1?books.get(0):null;
    }

    public void hisById (Book bookbor,int userid,String login) throws ClassNotFoundException,SQLException{
        connectionFactory factory = new connectionFactory();
        Connection connection = factory.create();
        PreparedStatement statement = connection.
                prepareStatement("insert into history" +
                        "(book_id,name,AUTHOR,LOCATION_ID,borr_userid,borr_username,borr_time) values (?,?,?,?,?,?,?)");
        statement.setInt(1, bookbor.getBook_id());
        statement.setString(2, bookbor.getName());
        statement.setString(3, bookbor.getAuthor());
        statement.setString(4, bookbor.getLocation_ID());
        statement.setInt(5, userid);
        statement.setString(6, login);
        SimpleDateFormat formatter= new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
        Date date = new Date(System.currentTimeMillis());
        statement.setString(7, formatter.format(date));
        statement.executeUpdate();
    }
    public void borrowById(int book_id) throws SQLException, ClassNotFoundException {
        connectionFactory factory = new connectionFactory();
        Connection connection = factory.create();
        PreparedStatement statement = connection.
                prepareStatement("UPDATE book SET delete_yn ='Y' WHERE book_id= ?");
        statement.setInt(1,book_id);
        statement.executeUpdate();
    }

    public void returnById(int book_id) throws SQLException, ClassNotFoundException {
        connectionFactory factory = new connectionFactory();
        Connection connection = factory.create();
        PreparedStatement statement = connection.
                prepareStatement("UPDATE book SET delete_yn =' ' WHERE book_id= ?");
        statement.setInt(1,book_id);
        statement.executeUpdate();
        PreparedStatement statement2 = connection.
                prepareStatement("UPDATE history SET return_time=? WHERE book_id= ?");
        SimpleDateFormat formatter= new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
        Date date = new Date(System.currentTimeMillis());
        statement2.setString(1, formatter.format(date));
        statement2.setInt(2,book_id);
        statement2.executeUpdate();
    }

    public  List<Book> findAll() throws SQLException {
        connectionFactory factory =new connectionFactory();
        try(Connection connection =factory.create()) {
            PreparedStatement statement = connection.prepareStatement
                    ("select book_id,name,publish_year,author,location_id,GENRE_ID,description from book where delete_yn <> 'Y' or delete_yn is null");
            ResultSet resultSet = statement.executeQuery();
            return  map(resultSet);
        }
    }

    public  List<Book> selectBook(String name,String author ) throws SQLException {
        connectionFactory factory =new connectionFactory();
        try(Connection connection =factory.create()) {
            String sql="select * from book";
            if (name!=""&& author!=""){
               sql +=" where name=? and author=?";
            }
            else if (name==""&& author!=""){
                sql += " where author=?";
            }
            else if (name!=""&& author==""){
                sql += " where name=? ";
            }
            else{
                sql += " where name <> '' and author <> ''";
            }
            PreparedStatement statement = connection.prepareStatement(sql);
            if (name!=""&& author!=""){
                statement.setString(1, name);
                statement.setString(2, author);
            }
            else if (name==""&& author!=""){
                statement.setString(1, author);
            }
            else if (name!=""&& author==""){
                statement.setString(1, name);
            }

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
            int id = Integer.parseInt(resultSet.getString("book_id"));
            String name = resultSet.getString("name");
            String publish_year=resultSet.getString("publish_Year");
            String author= resultSet.getString("author");
            String location_ID=resultSet.getString("location_ID");
            String GENRE_ID=resultSet.getString("genre_id");
            String description=resultSet.getString("description");
            Book book = new Book(id,name,publish_year,author,location_ID,GENRE_ID,description);
            books.add(book);
        }
        return books;
    }


}

