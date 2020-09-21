package com.bagan.training;

public class GreetingImpl implements Greeting {
    public String green(String name){

        if (name == null || name.length() == 0){
            throw new IllegalArgumentException();
        }

        return "Hello " + name;
    }
}
