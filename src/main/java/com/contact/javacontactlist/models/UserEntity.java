package com.contact.javacontactlist.models;

import javax.persistence.*;

/**
 * Entity Users
 *
 * @author ialeman
 */
@Entity
@Table(name = "users")
public class UserEntity {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "userid")
    private Integer userId;

    @Column(name = "username")
    private String username;

    @Column(name = "userfullname")
    private String userFullName;

    @Column(name = "userpassword")
    private String userPassword;

    @Column(name = "userlastlogin")
    private Long userLastLogin;

    /* getters and setters */
    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserFullName() {
        return userFullName;
    }

    public void setUserFullName(String userFullName) {
        this.userFullName = userFullName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public Long getUserLastLogin() {
        return userLastLogin;
    }

    public void setUserLastLogin(Long userLastLogin) {
        this.userLastLogin = userLastLogin;
    }

    @Override
    public String toString() {
        return "UserEntity{" +
                "userId=" + userId +
                ", username='" + username + '\'' +
                ", userFullName='" + userFullName + '\'' +
                ", userPassword='" + userPassword + '\'' +
                ", userLastLogin=" + userLastLogin +
                '}';
    }
}
