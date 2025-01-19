package ru.boyarshinov.MySecondSpringBootApp.exception;

public class ValidationFailedException extends Exception {
    public ValidationFailedException(String message) { super(message); }
}