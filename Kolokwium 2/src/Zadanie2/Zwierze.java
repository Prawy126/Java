package Zadanie2;

import Zadanie1.ValueNegativeException;

abstract public class Zwierze {
    private String nazwa;
    private int wiek;
    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public void setWiek(int wiek) throws ValueNegativeException {
        this.wiek = wiek;
    }

    public void setGatunek(String gatunek) {
        this.gatunek = gatunek;
    }

    private String gatunek;

    public String getGatunek() {
        return gatunek;
    }

    public String getNazwa() {
        return nazwa;
    }

    public int getWiek() {
        return wiek;
    }
    public Zwierze(String nazwa, String gatunek){
        this.nazwa=nazwa;
        this.gatunek=gatunek;
    }
    public Zwierze(String nazwa, String gatunek, int wiek){
        this.nazwa = nazwa;
        this.gatunek=gatunek;
        if(wiek<0){
            this.wiek=0;
        }else {
            this.wiek=wiek;
        }

    }
    abstract public void WyadjGlos();
    public void PokazInformacje(){
        System.out.println("Dane zwierzęcia:");
        System.out.println("Gatunek: " + this.gatunek);
        System.out.println("Nazwa: " + this.nazwa);
        System.out.println("Wiek: " + this.wiek);
        this.WyadjGlos();
    }
}
