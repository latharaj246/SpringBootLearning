package com.example.loose.coupling;

public class UserManager {


    private UserDataProvider userDataProvider;


    public UserManager(UserDataProvider userDataProvider) {
        this.userDataProvider = userDataProvider;
    }

    public String getUserInfo() {
        return userDataProvider.getUserDetailes();
    }
}