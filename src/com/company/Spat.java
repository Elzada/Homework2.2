package com.company;

public class Spat extends  Person implements Printable {
    private String krovat;

    public Spat(String krovat) {
        setName("Elzada");
        this.krovat = krovat;
    }

    @Override
    public void print() {
        System.out.println("Person:"+getName()+"\n"+"Krovat:"+krovat);
    }
}
