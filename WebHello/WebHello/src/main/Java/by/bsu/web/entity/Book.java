package by.bsu.web.entity;

public class Book {
    private String book_id;
    private String name;
    private String publish_Year;
    private String author;
    private String location_ID;
    private String GENRE_ID;
    private String description;

    public Book( String name, String publish_Year, String author, String location_ID, String GENRE_ID, String description) {
        this.name = name;
        this.publish_Year = publish_Year;
        this.author = author;
        this.location_ID = location_ID;
        this.GENRE_ID = GENRE_ID;
        this.description = description;
    }

    public String getBook_id() {
        return book_id;
    }

    public void setBook_id(String book_id) {
        this.book_id = book_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPublish_Year() {
        return publish_Year;
    }

    public void setPublish_Year(String publish_Year) {
        this.publish_Year = publish_Year;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getLocation_ID() {
        return location_ID;
    }

    public void setLocation_ID(String location_ID) {
        this.location_ID = location_ID;
    }

    public String getGENRE_ID() {
        return GENRE_ID;
    }

    public void setGENRE_ID(String GENRE_ID) {
        this.GENRE_ID = GENRE_ID;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
