package com.example.loose.coupling;

import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class LooseCouplingExample {

    public static void main(String[] args) {
        UserDataProvider dataProvider = new UserDatabaseProvider();
        UserManager userManagerWithDB = new UserManager(dataProvider);
        System.out.println(userManagerWithDB.getUserInfo());

        WebServerDataProvider webServerDataProvider = new WebServerDataProvider();
        UserManager userManagerWithWS = new UserManager(webServerDataProvider);
        System.out.println(userManagerWithWS.getUserInfo());


    }


}
