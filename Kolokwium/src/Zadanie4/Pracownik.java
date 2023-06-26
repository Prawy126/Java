package Zadanie4;

import Zadanie3.Osoba;

public class Pracownik extends Osoba {
    String zawod;
    int staz_pracy;
    public Pracownik(String zawod, int staz_pracy){
        this.zawod = zawod;
        this.staz_pracy = staz_pracy;
    }
    public Pracownik(String imie, String nazwisko,int wiek, String nazwaKraju, String zawod, int staz_pracy){
        super(imie,nazwisko,wiek,nazwaKraju);
        this.staz_pracy=staz_pracy;
        this.zawod = zawod;
    }
}
