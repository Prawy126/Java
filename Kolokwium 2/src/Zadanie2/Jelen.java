package Zadanie2;

public class Jelen extends Zwierze implements  IBiegaj{
    private float predkosc;
    @Override
    public void WyadjGlos() {
        System.out.println("Jeleń wydaje głos");
    }

    @Override
    public void Biegnij(int predkoscBiegu){
        System.out.println("Jeleń biegnie z prędkością " + predkoscBiegu);
        predkosc = predkoscBiegu;
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
    public Jelen(String gatunek, String nazwa, int wiek,float predkosc){
        super(nazwa, gatunek,wiek);
        this.predkosc = predkosc;
    };
}
