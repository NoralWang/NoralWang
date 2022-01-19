package by.bsu.web.command;

public class CommandFactory {
    public Command create(String command){
        switch(command){
            case "login":
                return new logincommand();
            case "booklist":
                return new BookListCommand();
            case "addbook":
                return new AddBookPage();
            case "addbookPage":
                return new AddBookCommand();
            case "logout":
                return new logincommand();
            case "Return":
                return new logoutcommand();
            default:
                throw new UnsupportedOperationException();
        }
    }
}
