package com.example.tight.coupling;

public class UserManager1 {
    UserDatabase userDatabase = new UserDatabase();


    public String getUserInfo() {
        return userDatabase.getUserDetailes();
    }
}
