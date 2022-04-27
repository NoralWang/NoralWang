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
                return new maincommand();
            case "addUser":
                return new addUsercommand();
            case "addUserPage":
                return new AdduserPage();
            case "Rtbook":
                return new ReturnCommand();
            case "history":
                return new BorrowHisCommand();
            case"userManagement":
                return new UserMCommand();
            case"bookinfo":
                return new Bookinfopage();
            case "successpage":
                return new Sucesspage();


            default:
                throw new UnsupportedOperationException();
        }
    }
}
