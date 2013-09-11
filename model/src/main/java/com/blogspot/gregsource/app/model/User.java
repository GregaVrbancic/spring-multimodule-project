package com.blogspot.gregsource.app.model;

/**
 * Created with IntelliJ IDEA.
 * User: grega
 * Date: 11/9/13
 * Time: 7:31 PM
 */
public class User {
    int id;
    String username;
    String firstName;
    String lastName;
    String address;

    public User(int id, String username, String firstName, String lastName, String address) {
        this.id = id;
        this.username = username;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }

    public User(){
        this.id = 1;
        this.username = "defaultUsername";
        this.firstName = "defaultFirstName";
        this.lastName = "defaultLastName";
        this.address = "defaultAddress";
    }

    @Override
    public String toString(){
        return "id: " + id +
                "\n username: " + username +
                "\n firstName: " + firstName +
                "\n lastName: " + lastName +
                "\n address: " + address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}