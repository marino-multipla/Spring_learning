package com.example.restservice;

public class Animal {

    private String name;
    private String date_of_birth;
    private String color;
    private int years;

    public Animal() {
        this.name = "Carl";
        this.date_of_birth = "22/01/2001";
        this.color = "Red";
        this.years = 18;
    }

    public Animal(String name, String date_of_birth, String color, int years) {
        this.name = name;
        this.date_of_birth = date_of_birth;
        this.color = color;
        this.years = years;
    }

    public String getName() {
        return name;
    }

    public String getDate_of_birth() {
        return date_of_birth;
    }

    public String getColor() {
        return color;
    }

    public int getYears() {
        return years;
    }
}
