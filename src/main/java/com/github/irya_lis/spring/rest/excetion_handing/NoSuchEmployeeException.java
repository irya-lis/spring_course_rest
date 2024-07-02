package com.github.irya_lis.spring.rest.excetion_handing;

public class NoSuchEmployeeException extends RuntimeException{
    public NoSuchEmployeeException(String message) {
        super(message);
    }
}
