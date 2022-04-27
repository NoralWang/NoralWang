package by.bsu.web.entity;

public class History {
    private int book_id;
    private String name;
    private String LOCATION_ID;
    private String AUTHOR;
    private String borr_time;
    private String borr_userid;
    private String borr_username;
    private String return_time;


    public History(int book_id, String name, String LOCATION_ID, String AUTHOR, String borr_time, String borr_userid, String borr_username, String return_time) {
        this.book_id = book_id;
        this.name = name;
        this.LOCATION_ID = LOCATION_ID;
        this.AUTHOR = AUTHOR;
        this.borr_time = borr_time;
        this.borr_userid = borr_userid;
        this.borr_username = borr_username;
        this.return_time = return_time;
    }

    public int getBook_id() {
        return book_id;
    }

    public void setBook_id(int book_id) {
        this.book_id = book_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBorr_time() {
        return borr_time;
    }

    public void setBorr_time(String borr_time) {
        this.borr_time = borr_time;
    }

    public String getBorr_userid() {
        return borr_userid;
    }

    public void setBorr_userid(String borr_userid) {
        this.borr_userid = borr_userid;
    }

    public String getBorr_username() {
        return borr_username;
    }

    public void setBorr_username(String borr_username) {
        this.borr_username = borr_username;
    }

    public String getLOCATION_ID() {
        return LOCATION_ID;
    }

    public void setLOCATION_ID(String LOCATION_ID) {
        this.LOCATION_ID = LOCATION_ID;
    }

    public String getReturn_time() {
        return return_time;
    }

    public void setReturn_time(String return_time) {
        this.return_time = return_time;
    }

    public String getAUTHOR() {
        return AUTHOR;
    }

    public void setAUTHOR(String AUTHOR) {
        this.AUTHOR = AUTHOR;
    }
}


