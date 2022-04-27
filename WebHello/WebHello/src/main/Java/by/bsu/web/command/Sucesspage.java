package by.bsu.web.command;

import by.bsu.web.dao.BookDao;
import by.bsu.web.dao.UserDao;
import by.bsu.web.entity.Book;
import by.bsu.web.entity.User;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.SQLException;

public class Sucesspage implements Command{
    @Override
    public String execute(HttpServletRequest req, HttpServletResponse resp)
            throws SQLException, ClassNotFoundException {
        int id=Integer.parseInt(req.getParameter("book_id"));
        BookDao dao = new BookDao();
        Book bookinfo= dao.findById(id);
        dao.borrowById(id);
        req.setAttribute("bookinfo",bookinfo);
        int userid=Integer.parseInt(req.getParameter("userid"));
        String login=req.getParameter("login");
        dao.hisById(bookinfo,userid,login);


        return"WEB-INF/View/success.jsp";

    }
}
