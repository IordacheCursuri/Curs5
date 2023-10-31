package com.itFactory.mostenire.hasA;

public class Exemplu2 {

    public static void main(String[] args) {

        Adresa adresa = new Adresa("Calea Mosilor", "1000");
        adresa.setStrada("Bld. Regina Maria");
        adresa.setNumar("9654452454");

        Buletin buletin = new Buletin("18256325987", "RX");


        Persoana persoana = new Persoana();
        persoana.setNume("Gigle");
        persoana.setAdresa(adresa);
        persoana.setBuletin(buletin);

        System.out.println(persoana.getAdresa().getStrada());
        System.out.println(persoana.getBuletin().getCnp());
        System.out.println(persoana.getAdresa().getNumar());

        Persoana persoana2 = new Persoana("Ionel", buletin, adresa);


    }


}
