package com.mypoc.exceptions;

public class EmployeeNotFound extends RuntimeException{

    public EmployeeNotFound(){
        super("Resource Not Found on Server");
    }
    public EmployeeNotFound(String message){
        super(message);
    }
}
