package com.company;

public class Est extends Person implements Printable {
    private String eda;

    public Est(String eda) {
        setName("Elzada");
        this.eda = eda;
    }


    @Override
    public void print() {
        System.out.println("Person:"+getName()+"\n"+"Eda:"+eda);
    }
}
