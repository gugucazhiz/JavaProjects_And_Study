package com.example;

public class overideM {
    public static void main(String[] args){
        overideM obj = new overideM();
        System.out.println("\n"+obj.sum(2, 4)+" Result of the first method");
        System.out.println("\n"+obj.sum(2, 4, 6)+" Result of the second method");
        System.out.println("\n"+obj.sum(2, 4, 6, 8)+" Result of the third method");
    }

    public int sum(int a, int b){
        return a+b;
    }

    public int sum(int a, int b, int c){
        return a+b+c;
    }

    public int sum(int a, int b, int c, int d){
        return a+b+c+d;
    }
}
