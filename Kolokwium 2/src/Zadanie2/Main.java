package Zadanie2;

import Zadanie1.ValueNegativeException;

public class Main {
    public static void main(String[] args){
        try{
            Sokol sokol = new Sokol("Czarny", "Wędrowny",10,12,29);
            Tygrys tygrys = new Tygrys("Tygrysek", "Indyjski",2,30);
            Jelen jelen = new Jelen("Polski","Jelonek",12,120);
            Pirania pirania = new Pirania("Pirania","Rybka",3,19,1000);
            sokol.Lataj(12,102);
            sokol.Atakuj();
            sokol.pokazInformacje();
            tygrys.pokazInformacje();
            jelen.Biegnij(12);
            jelen.WyadjGlos();
            jelen.pokazInformacje();
            pirania.pokazInformacje();
        }catch(ValueNegativeException e){
            System.out.println(e.toString());
        }

    }
}
