package by.bsu.web.command;

import by.bsu.web.dao.BookDao;
import by.bsu.web.entity.Book;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.SQLException;

public class Bookinfopage implements Command{
    @Override
    public String execute(HttpServletRequest req, HttpServletResponse resp)
            throws SQLException, ClassNotFoundException {
        int id=Integer.parseInt(req.getParameter("book_id"));
        BookDao dao = new BookDao();
        Book book_id= dao.findById(id);
        req.setAttribute("book_id",book_id);
        System.out.println(book_id);
        return"WEB-INF/View/bookinfo.jsp";

    }
}
