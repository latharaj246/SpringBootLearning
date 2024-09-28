package com.example.loose.coupling;

public class WebServerDataProvider implements UserDataProvider {

    public String getUserDetailes() {
        return "web Details from web";
    }
}
