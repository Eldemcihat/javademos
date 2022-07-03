package com.example;

public class FileLogger extends BaseLogger {
    @Override
    public void log(String message){
        System.out.println("File log : "+message);
    }
}
