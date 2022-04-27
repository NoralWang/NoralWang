package by.bsu.web.command;

import by.bsu.web.dao.HisDao;
import by.bsu.web.dao.UserDao;
import by.bsu.web.entity.History;
import by.bsu.web.entity.User;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.SQLException;
import java.util.List;

public class BorrowHisCommand implements Command{
    @Override
    public String execute(HttpServletRequest req, HttpServletResponse resp) throws SQLException, ClassNotFoundException {

        Integer id = Integer.parseInt(req.getParameter("id"));
        HisDao hisdao = new HisDao();
        List<History> history=hisdao.findall(id);
        req.setAttribute("history",history);
        System.out.println(history);
        return"WEB-INF/View/borrhistory.jsp";
    }
}
