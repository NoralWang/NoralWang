package by.bsu.web.entity;

public class addUser {
    private int id;
    private String name;
    private String surname;
    private String loginac;
    private String password;
    private  Integer is_admin;
    private  String picture;

    public addUser(int id, String name, String surname, String loginac, String password, Integer is_admin, String picture) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.loginac = loginac;
        this.password = password;
        this.is_admin = is_admin;
        this.picture = picture;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getLoginac() {
        return loginac;
    }

    public void setLoginac(String loginac) {
        this.loginac = loginac;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getIs_admin() {
        return is_admin;
    }

    public void setIs_admin(Integer is_admin) {
        this.is_admin = is_admin;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }
}


