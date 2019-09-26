package com.company;

public class Smotret extends Person implements Printable{
    private String tv;

    public Smotret(String tv) {
        setName("Elzada");
        this.tv = tv;
    }

    @Override
    public void print() {
        System.out.println("Person:"+getName()+"\n"+"Tv:"+tv);
    }
}
