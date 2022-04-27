package by.bsu.web.command;

import by.bsu.web.dao.BookDao;
import by.bsu.web.dao.HisDao;
import by.bsu.web.entity.Book;
import by.bsu.web.entity.History;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.SQLException;
import java.util.List;

public class ReturnCommand implements Command{
    @Override
    public String execute(HttpServletRequest req, HttpServletResponse resp) throws SQLException, ClassNotFoundException {

        int book_id=Integer.parseInt(req.getParameter("book_id"));
        BookDao dao = new BookDao();
        dao.returnById(book_id);
        return"WEB-INF/View/success.jsp";
    }
}
