package by.bsu.web;

import by.bsu.web.command.Command;
import by.bsu.web.command.CommandFactory;
import by.bsu.web.command.logincommand;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

public class Controller extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws IOException, ServletException {
        process(req,resp);
    }

    public void doPost(HttpServletRequest req, HttpServletResponse resp)
         throws IOException, ServletException {
        process(req, resp);
    }
    public void process(HttpServletRequest req, HttpServletResponse resp)
            throws IOException, ServletException {
        //            resp.getWriter().write("<html><H2>Hello,class!</H2></html>");

        CommandFactory factory=new CommandFactory();
        String commandPara=req.getParameter("command");
        Command command =factory.create(commandPara);
        try {
            String page = command.execute(req, resp);
            req.getRequestDispatcher(page).forward(req,resp);
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
