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



}
