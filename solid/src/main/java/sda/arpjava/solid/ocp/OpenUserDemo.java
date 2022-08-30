package sda.arpjava.solid.ocp;

import sda.arpjava.solid.srp.User;

public class OpenUserDemo {
    public static void main(String[] args) {
        //Drugi sposób rozszerzenia klasy User
        //wykorzystanie konstruktora z parametrem formattera powoduje, że klasa jest otwarta na rozszerzenia
        //własnych formaterów bez stosowania dzedziczenia
        User user = new User("adam","kowal","1234","adam@sda.pl",
                input -> input.substring(0,2).toUpperCase() + input.substring(2).toLowerCase()
        );

    }
}



