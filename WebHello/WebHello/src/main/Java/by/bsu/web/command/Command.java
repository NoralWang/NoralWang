package by.bsu.web.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.SQLException;

public interface Command {
    String execute(HttpServletRequest req, HttpServletResponse resp)
            throws SQLException, ClassNotFoundException;
}
