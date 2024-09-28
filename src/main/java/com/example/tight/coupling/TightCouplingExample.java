package com.example.tight.coupling;

import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class TightCouplingExample {

    public static void main(String[] args) {
        UserManager1 userManager = new UserManager1();
        System.out.println(userManager.getUserInfo());
    }

}
