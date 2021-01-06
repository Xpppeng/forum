package com.example.forum.domain;

public class User {
    private int uId;
    private String uName;
    private String uPassword;
    private GroupManager grId;

    public User() {
    }

    public User(int uId, String uName, String uPassword, GroupManager grId) {
        this.uId = uId;
        this.uName = uName;
        this.uPassword = uPassword;
        this.grId = grId;
    }

    @Override
    public String toString() {
        return "User{" +
                "uId=" + uId +
                ", uName='" + uName + '\'' +
                ", uPassword='" + uPassword + '\'' +
                ", grId=" + grId +
                '}';
    }

    public int getuId() {
        return uId;
    }

    public void setuId(int uId) {
        this.uId = uId;
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName;
    }

    public String getuPassword() {
        return uPassword;
    }

    public void setuPassword(String uPassword) {
        this.uPassword = uPassword;
    }

    public GroupManager getGrId() {
        return grId;
    }

    public void setGrId(GroupManager grId) {
        this.grId = grId;
    }
}
