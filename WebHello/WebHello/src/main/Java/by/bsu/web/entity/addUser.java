package by.bsu.web.entity;

public class addUser {

    private String name;
    private String surname;
    private String login;
    private String password;
    private  Integer admin;

    public addUser(String name, String surname, String login, String password, Integer admin) {
        this.name = name;
        this.surname = surname;
        this.login = login;
        this.password = password;
        this.admin = admin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getAdmin() {
        return admin;
    }

    public void setAdmin(Integer admin) {
        this.admin = admin;
    }
}


