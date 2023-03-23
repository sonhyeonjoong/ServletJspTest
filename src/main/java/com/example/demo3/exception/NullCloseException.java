package com.example.demo3.exception;

public class NullCloseException extends Exception{
    public NullCloseException() {}
    public NullCloseException(String message) {
        super(message);
    }
}