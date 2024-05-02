package TP4_1_H071231054.models;

public class User {
    private String username, password;

    
    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }
    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}