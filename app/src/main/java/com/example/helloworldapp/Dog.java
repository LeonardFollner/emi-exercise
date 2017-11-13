package com.example.helloworldapp;

import java.io.Serializable;

public class Dog implements Serializable {
    private String name;
    private String breed;
    private int size;

    public Dog(String name, String breed, int size) {
        this.name = name;
        this.breed = breed;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }
}
