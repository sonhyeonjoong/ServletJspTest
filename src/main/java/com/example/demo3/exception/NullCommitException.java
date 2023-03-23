package com.example.demo3.exception;

public class NullCommitException extends Exception{
    public NullCommitException() {}
    public NullCommitException(String message) {
        super(message);
    }
}
