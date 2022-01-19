package by.bsu.web.entity;

public class Book {
    private Integer book_id;
    private String name;

    public Book(Integer book_id, String name) {
        this.book_id = book_id;
        this.name = name;
    }

    public Integer getBook_id() {
        return book_id;
    }

    public void setBook_id(Integer book_id) {
        this.book_id = book_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
