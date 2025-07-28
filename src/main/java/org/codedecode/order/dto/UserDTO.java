package org.codedecode.order.dto;

public class UserDTO  {


    private int userId;
    private String username;
    private String password;
    private String address;
    private String city;

    public UserDTO() {
    }

    public UserDTO(int userId, String username, String password, String address, String city) {
        this.userId = userId;
        this.username = username;
        this.password = password;
        this.address = address;
        this.city = city;
    }


    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
