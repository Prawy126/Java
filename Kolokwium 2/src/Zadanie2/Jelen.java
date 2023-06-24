package Zadanie2;

import Zadanie1.ValueNegativeException;

public class Jelen extends Zwierze implements  IBiegaj{
    private int predkosc;
    @Override
    public void WyadjGlos() {
        System.out.println("Jeleń wydaje głos");
    }

    @Override
    public void Biegnij(int predkoscBiegu)throws ValueNegativeException {
        if(predkoscBiegu<0){
            throw new ValueNegativeException(predkoscBiegu);
        }else{
            System.out.println("Jeleń biegnie z prędkością " + predkoscBiegu);
            predkosc = predkoscBiegu;
        }

    }
    @Override
    public void pokazInformacje(){
        System.out.println("Dane zwierzęcia:");
        System.out.println("Gatunek: " + super.getGatunek());
        System.out.println("Nazwa: " + super.getNazwa());
        System.out.println("Wiek: " + super.getWiek());
        System.out.println("Biega z predkoscia: " + this.predkosc);
        this.WyadjGlos();
    }
    public Jelen(String gatunek, String nazwa, int wiek,int predkosc)throws ValueNegativeException{
        super(nazwa, gatunek,wiek);
        if(predkosc<0){
            throw new ValueNegativeException(predkosc);
        }
        this.predkosc = predkosc;
    };
}
