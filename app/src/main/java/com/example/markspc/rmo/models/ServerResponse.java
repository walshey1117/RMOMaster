package com.example.markspc.rmo.models;

/**
 * Created by Marks PC on 30/11/2017.
 */

public class ServerResponse {

    public String result;
    public String message;
    public User user;

    public String getResult() {
        return result;
    }

    public String getMessage() {
        return message;
    }

    public User getUser() {
        return user;
    }
}
