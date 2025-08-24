package com.example;
import java.util.Random;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("Input a Number 0 to 10: ");
        int num = scan.nextInt();
        int a =rand.nextInt(1,10);
        boolean isTrue = (num == a? true : false);
        System.out.println(isTrue? "You guessed The right number" : "Thats doesn't seem right, The correct one was "+rand.nextInt(1,10));
        scan.close();
    }
}