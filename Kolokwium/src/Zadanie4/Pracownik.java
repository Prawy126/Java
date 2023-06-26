package Zadanie4;

import Zadanie3.Osoba;

public class Pracownik extends Osoba {
    public void setZawod(String zawod) {
        this.zawod = zawod;
    }

    public void setStaz_pracy(int staz_pracy) {
        this.staz_pracy = staz_pracy;
    }

    private String zawod;

    public String getZawod() {
        return zawod;
    }

    public int getStaz_pracy() {
        return staz_pracy;
    }

    private int staz_pracy;
    public Pracownik(String zawod, int staz_pracy){
        this.zawod = zawod;
        this.staz_pracy = staz_pracy;
    }
    public Pracownik(String imie, String nazwisko,int wiek, String nazwaKraju, String zawod, int staz_pracy){
        super(imie,nazwisko,wiek,nazwaKraju);
        this.staz_pracy=staz_pracy;
        this.zawod = zawod;
    }
    @Override
    public void WyswietlDaneOsoby(){
        super.WyswietlDaneOsoby();
        System.out.println("Zawód: " + this.zawod);
        System.out.println("Liczba godzin stażu: " + this.staz_pracy);
    }
}
