package com.itFactory.polimorfism;

public class Pisica extends Animal{
    String nume;

    public Pisica(){
        this.nume = "nume din clasa Pisica";
        super.nume = "nume din clas Animal";
    }

    @Override
    public void zice() {
        System.out.println("metoda apelata din clasa Pisica");
    }
}
