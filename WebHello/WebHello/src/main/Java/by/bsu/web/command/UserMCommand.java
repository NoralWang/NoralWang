package by.bsu.web.command;

import by.bsu.web.dao.BookDao;
import by.bsu.web.dao.UserDao;
import by.bsu.web.entity.Book;
import by.bsu.web.entity.addUser;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.SQLException;
import java.util.List;

public class UserMCommand implements Command{
    @Override
    public String execute(HttpServletRequest req, HttpServletResponse resp) throws SQLException, ClassNotFoundException {
        UserDao userdao=new UserDao();
        List<addUser> users=userdao.findall();
        req.setAttribute("users",users);

        return"WEB-INF/View/usermanage.jsp";
    }
}
