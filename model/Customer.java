package model;

public class Customer {
    private String name;
    private String sureName;
    private String email;
    private String phone;
    private String address;


    public Customer(String name, String sureName, String email, String phone, String address) {
        this.name = name;
        this.sureName = sureName;
        this.email = email;
        this.phone = phone;
        this.address = address;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSureName() {
        return sureName;
    }

    public void setSureName(String sureName) {
        this.sureName = sureName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer { " +
                " name = '" + name + '\'' +
                ", sureName = '" + sureName + '\'' +
                ", email = '" + email + '\'' +
                ", phone = '" + phone + '\'' +
                ", address = '" + address + '\'' +
                '}';
    }
}
