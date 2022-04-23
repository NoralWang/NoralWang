package by.bsu.web.entity;

public class User {
    private Integer id;
    private String name;
    private  int is_admin;
    private String login;

    public User(Integer id, String name, int is_admin) {
        this.id = id;
        this.name = name;
        this.is_admin = is_admin;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIs_admin() {
        return is_admin;
    }

    public void setIs_admin(int is_admin) {
        this.is_admin = is_admin;
    }
}
