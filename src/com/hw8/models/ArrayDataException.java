package com.hw8.models;

public class ArrayDataException extends Exception {
    //fields
    private String errorElem;

    //constructor
    public ArrayDataException(String message, String errorElem){
        super(message);
        this.errorElem = errorElem;
    }
    //methods
    public String getErrorElem(){
        return errorElem;
    }

}
