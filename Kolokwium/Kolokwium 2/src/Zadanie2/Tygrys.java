package Zadanie2;

import Zadanie1.ValueNegativeException;

public class Tygrys extends Zwierze implements IBiegaj, IDrapieznictwo{
    private int predkoscBiegu;
    @Override
    public void Biegnij(int predkoscBiegu) {
        this.predkoscBiegu = predkoscBiegu;
    }

    @Override
    public void Atakuj() {
        System.out.println("Tygrys atakuje");
    }

    @Override
    public void WyadjGlos() {
        System.out.println("Tygrys wydaje głos");
    }

    @Override
    public void pokazInformacje() {
        System.out.println("Informacje o Tygrysie:");
        System.out.println("Nazwa: " + super.getNazwa());
        System.out.println("Gatunek: " + super.getGatunek());
        System.out.println("Wiek: " + super.getWiek());
        System.out.println("Prędkość biegu: " + this.predkoscBiegu);
    }
    public Tygrys(String nazwa, String gatunek, int wiek, int predkoscBiegu)throws ValueNegativeException {
        super(nazwa,gatunek,wiek);
        if(predkoscBiegu<0){
            throw new ValueNegativeException(predkoscBiegu);
        }
    }
}
