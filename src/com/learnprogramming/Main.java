package com.learnprogramming;

public class Main {

    public static void main(String[] args) {
        Car porsche = new Car(); //porsche is an object of type Car (based on the template Car)
        Car holden = new Car();
        porsche.setModel("Carrera");
        System.out.println("Model is " + porsche.getModel());

    }
}
