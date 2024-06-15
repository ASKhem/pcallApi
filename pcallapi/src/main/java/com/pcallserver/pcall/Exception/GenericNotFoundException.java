package com.pcallserver.pcall.Exception;

public class GenericNotFoundException extends RuntimeException {
    public GenericNotFoundException() {
        super("The resource you are looking for does not exist");
    }
}