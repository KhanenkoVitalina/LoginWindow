package com.training.Model;

public class DataAlreadyExistsException extends Exception {
    private String existingElement;
    public DataAlreadyExistsException(String message) {
        super(message);
    }
    public void setExistingElemtnt(String existingElement){
        this.existingElement = existingElement;
    }
    public String getExistingElement(){
        return existingElement;
    }
}
