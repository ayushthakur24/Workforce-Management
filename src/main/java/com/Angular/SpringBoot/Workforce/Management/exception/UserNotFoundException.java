package com.Angular.SpringBoot.Workforce.Management.exception;

public class UserNotFoundException extends RuntimeException  {
    private static final String message = "User was not found";

    public UserNotFoundException(String s) {
        super(message);
    }
}
