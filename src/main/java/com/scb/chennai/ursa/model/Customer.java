package com.scb.chennai.ursa.model;

import jakarta.persistence.*;


@Entity
@Table(name = "customer")

public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String email;
    private String pwd;
    @Column(name = "role")
    private String role;

    public Customer(long id, String email, String pwd, String role) {
        this.id = id;
        this.email = email;
        this.pwd = pwd;
        this.role = role;
    }

    public Customer() {}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", pwd='" + pwd + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
}
