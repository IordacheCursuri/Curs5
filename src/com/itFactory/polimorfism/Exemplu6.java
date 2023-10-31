package com.itFactory.polimorfism;

public class Exemplu6 {

    public static void main(String[] args) {

        Animal animal = new Pisica();

        animal.zice();

        System.out.println(animal.nume);

        boolean x = animal instanceof Animal;

        System.out.println(x);

        Animal animal2 = new Caine();

        if(animal2 instanceof Caine){
            System.out.println("obiectul este de tip Caine");
        } else{
            System.out.println("obiectul este de tip Pisica");
        }



    }

}
