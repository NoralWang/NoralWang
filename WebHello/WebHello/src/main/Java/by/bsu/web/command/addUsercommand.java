package by.bsu.web.command;

import by.bsu.web.dao.BookDao;
import by.bsu.web.dao.UserDao;
import by.bsu.web.entity.Book;
import by.bsu.web.entity.addUser;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.*;
import javax.xml.crypto.dom.DOMCryptoContext;
import java.awt.*;
import java.sql.SQLException;

public class addUsercommand implements Command {
    @Override
    public String execute(HttpServletRequest req, HttpServletResponse resp)
            throws SQLException, ClassNotFoundException {

            UserDao adduser = new UserDao();
            String name = req.getParameter("name");
            System.out.println(name);
            String surname = req.getParameter("surname");
            String login = req.getParameter("login");
            String password = req.getParameter("password");
            String is_admin = req.getParameter("is_admin");
            int admin = Integer.parseInt(is_admin);
            String picture = req.getParameter("picture");
            addUser users = new addUser(Integer.parseInt("1"), name, surname, login, password, admin,picture);
            String iid=req.getParameter("id");
            System.out.println(iid);
            if ((iid!= "" && iid != null)) {
                System.out.println(req.getParameter("id"));
                int id=Integer.parseInt(req.getParameter("id"));
                adduser.update(id,users);
            }
            else{
                adduser.save(users);
            }

            if (users != null) {
                Frame frame=new Frame();
                frame.setAlwaysOnTop(true);
                JOptionPane.showMessageDialog(null, "Add User Success!");
                return "WEB-INF/View/addUser.jsp";
            }
            else {
                req.setAttribute("error_message", "Incorrect loginname");
                return "WEB-INF/View/addUser.jsp";
            }

    }
}
