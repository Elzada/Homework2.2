package com.company;

public class Main {

    public static void main(String[] args) {
        createObject("Spat").print();
        createObject("Smotret").print();
        createObject("Est").print();

    }
    public static Printable createObject(String className){
        Printable printable=null;
        switch ( className){
            case "Est":
                printable = new Est( "banana");
                break;
            case "Spat":
                printable = new Spat("Izzy");
                break;
            case"Smotret":
                printable = new Smotret("Kino");
                break;

        }return printable;
    }
}
