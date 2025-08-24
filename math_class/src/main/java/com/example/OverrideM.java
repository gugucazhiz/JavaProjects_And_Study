package com.example;

public class OverrideM {

    public static void main(String[] args){

        Car car = new Car("Vermelho");
        Car car2 = new Car("Vermelho","1977");
        Car car3 = new Car("Preto","1970","Chevette");

        Car[] cars = {car,car2,car3};

        System.out.println("-------------------------");
        System.out.println("Enhanced For Loop");
        System.out.println(" ");
        for(Car carros : cars){
            System.out.println(carros.comprarCarro());
        }

        System.out.println("-------------------------");
        System.out.println("Normal For Loop");
        System.out.println(" ");
        for(int i =0;i <cars.length; i++){
            System.out.println(cars[i].comprarCarro());
        }

        System.out.println(car.getnumOfCars());
    }
}
