package by.bsu.web.command;

import by.bsu.web.dao.BookDao;
import by.bsu.web.entity.Book;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.SQLException;
import java.util.List;

public class BookListSelectCommand implements Command {
    @Override
    public String execute(HttpServletRequest req, HttpServletResponse resp) throws SQLException, ClassNotFoundException {
        String name=req.getParameter("name");
        String author=req.getParameter("author");
        BookDao dao=new BookDao();
        List<Book> books=dao.selectBook(name,author);
        req.setAttribute("books",books);

        return"WEB-INF/View/book-list.jsp";
    }
}
