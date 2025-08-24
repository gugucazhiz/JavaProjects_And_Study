package com.example;

public class Animal {
    boolean isAlive;

    public Animal(){
        isAlive = true;
    }

    void isEating(){
        System.out.println(isAlive?"Animal is Eating":"Animal is not even alive!");
    }
}
