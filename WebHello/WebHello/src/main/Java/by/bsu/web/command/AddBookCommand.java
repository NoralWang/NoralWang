package by.bsu.web.command;

import by.bsu.web.dao.BookDao;
import by.bsu.web.entity.Book;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.*;
import java.sql.SQLException;

public class AddBookCommand implements Command {
    @Override
    public String execute(HttpServletRequest req, HttpServletResponse resp)
            throws SQLException, ClassNotFoundException {

        BookDao dao = new BookDao();
        String name = req.getParameter("name");
        String publish_year = req.getParameter("publish_Year");
        String author = req.getParameter("author");
        String locationID = req.getParameter("location_ID");
        String GENRE_ID = req.getParameter("genre_id");
        String description = req.getParameter("description");
        Book book = new Book(Integer.parseInt(" "),name, publish_year, author, locationID, GENRE_ID, description);
        dao.save(book);

        if (book != null) {
            JOptionPane.showMessageDialog(null, "Add Book Success!");
            return"WEB-INF/View/addbook.jsp";
        } else {
            req.setAttribute("error_message", "Incorrect Add Book");
            return"WEB-INF/View/addbook.jsp";
        }
    }
}
