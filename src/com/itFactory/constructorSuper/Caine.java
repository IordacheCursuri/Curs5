package com.itFactory.constructorSuper;

public class Caine extends Animal {


    public Caine(String nume) {
        super(nume);
        System.out.println("s-a apelat constructorul din clasa caine");
    }
}
