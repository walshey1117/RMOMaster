package com.example.markspc.rmo.models;

/**
 * Created by Marks PC on 30/11/2017.
 */

public class ServerRequest {

    private String operation;
    private User user;

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
