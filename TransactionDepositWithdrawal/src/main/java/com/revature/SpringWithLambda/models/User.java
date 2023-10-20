package com.revature.models;

import org.springframework.stereotype.Component;

import javax.persistence.*;


@Entity
@Table(name = "user")
@Component
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long userId;

    @Column(nullable = false, unique = true)
    private String username;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    @Column(nullable = false, unique = true)
    private String email;

    @Column
    private String phone;
    
    @Column(nullable = false)
    private BigDecimal balance;



    @ManyToOne
    @JoinColumn(name = "account_id")
    private Account busId;


    public User(){}

    public User(long userId, String username, String password, String firstName, String lastName, String email, String phone, BigDecimal balance, Account busId) {
        this.userId = userId;
        this.username = username;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        this.balance = balance;
        this.busId = busId;
    }

    public User(String username, String password, String firstName, String lastName, String email, String phone, BigDecimal balance) {
        this.username = username;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        this.balance = balance;
    }


    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
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
    
    public BigDecimal getBalance() {
    	return balance;
    }
    
    public void setBalance() {
    	this.balance = balance;
    }
    
    public Account getBusId() {
        return busId;
    }

    public void setBusId(Account busId) {
        this.busId = busId;
    }
    
   
    
    @Override
    public String toString() {
        return "com.revature.models.User{" +
                "userId=" + userId +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", balance='" + balance + '\'' +
                ", busId=" + busId +
                '}';
    }
}