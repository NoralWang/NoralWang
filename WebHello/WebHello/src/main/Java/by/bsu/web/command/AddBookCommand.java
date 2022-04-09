package by.bsu.web.command;

import by.bsu.web.command.Command;
import by.bsu.web.dao.BookDao;
import by.bsu.web.entity.Book;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.SQLException;
import java.util.List;

public class AddBookCommand implements Command {
    @Override
    public String execute(HttpServletRequest req, HttpServletResponse resp)
            throws SQLException, ClassNotFoundException {

        BookDao dao=new BookDao();
        String name=req.getParameter("name");
        Book book=new Book(null,name);
        dao.save(book);

        return"controller?command=login";

    }
}
