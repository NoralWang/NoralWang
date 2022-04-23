package by.bsu.web.command;

import by.bsu.web.dao.BookDao;
import by.bsu.web.dao.UserDao;
import by.bsu.web.entity.Book;
import by.bsu.web.entity.addUser;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.SQLException;
import java.util.List;

public class BookListCommand implements Command {
    @Override
    public String execute(HttpServletRequest req, HttpServletResponse resp)
            throws SQLException, ClassNotFoundException {

        BookDao dao=new BookDao();
        List<Book> books=dao.findAll();
        req.setAttribute("books",books);

        return"WEB-INF/View/book-list.jsp";
    }
}
