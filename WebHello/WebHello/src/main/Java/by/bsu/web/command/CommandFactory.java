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
                return new mainPage();
            case "addUser":
                return new addUsercommand();
            case "addUserPage":
                return new AdduserPage();
            case "Rtbookpage":
                return new ReturnPageCommand();
            case "Rtbook":
                return new ReturnBookCommand();
            case "history":
                return new BorrowHisCommand();
            case"userManagement":
                return new UserMCommand();
            case"bookinfo":
                return new Bookinfopage();
            case "successpage":
                return new Sucesspage();
            case "selectbook":
                return new BookListSelectCommand();
            case "selectUser":
                return new UserSelectCommand();


            default:
                throw new UnsupportedOperationException();
        }
    }
}
