package com.learnprogramming;

public class Car {

    private int doors;
    private int wheels;
    private String model; //this is a field
    private String engine;
    private String colour;

    public void setModel(String model) {  //String model is a parameter, the set methods updates the field with the content of the parameter that was passed here
        String validModel = model.toLowerCase();
        if (validModel.equals("carrera") || validModel.equals("commodore")) {
            this.model = model;
        } else {
            this.model = "Unknown";
        }

    }

    public String getModel() {
        return this.model;
    }


}
