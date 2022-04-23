package by.bsu.web.command;

import by.bsu.web.dao.UserDao;
import by.bsu.web.entity.addUser;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.*;
import java.sql.SQLException;

public class addUsercommand implements Command{
    @Override
    public String execute(HttpServletRequest req, HttpServletResponse resp)
            throws SQLException, ClassNotFoundException {

        UserDao adduser=new UserDao();
        String name=req.getParameter("name");
        String surname =req.getParameter("surname");
        String login = req.getParameter("login");
        String password=req.getParameter("password");
        addUser users = new addUser(name,surname,login,password,0);
        adduser.save(users);

        if (users!=null){
            JOptionPane.showMessageDialog(null, "Add User Success!");
            return"index.jsp";
        }
        else{
            req.setAttribute("error_message","Incorrect loginname");
            return"WEB-INF/View/addUser.jsp";
        }

    }
}
