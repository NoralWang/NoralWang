package by.bsu.web.command;

import by.bsu.web.dao.BookDao;
import by.bsu.web.dao.UserDao;
import by.bsu.web.entity.Book;
import by.bsu.web.entity.addUser;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.SQLException;
import java.util.List;

public class AdduserPage implements Command {
    @Override
    public String execute(HttpServletRequest req, HttpServletResponse resp)
            throws SQLException, ClassNotFoundException {

        int id = Integer.parseInt(req.getParameter("uid"));
        req.setAttribute("uid", id);
        req.setAttribute("userinfo", "");
        if (id != 1 & id != 2) {
            UserDao adduser = new UserDao();
            addUser userinfo = adduser.findById(id);
            req.setAttribute("userinfo", userinfo);
        }
        return "WEB-INF/View/addUser.jsp";
    }
}
