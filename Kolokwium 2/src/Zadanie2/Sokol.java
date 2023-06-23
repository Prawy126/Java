package Zadanie2;

public class Sokol extends Zwierze implements Ilatanie, IDrapieznictwo{
    private int predkoscLatania, wysokosc;
    @Override
    public void Lataj(int predkoscLatania, int wysokosc) {
        this.predkoscLatania = predkoscLatania;
        this.wysokosc = wysokosc;
    }

    @Override
    public void WyadjGlos() {
        System.out.println("Sokół wydaje głos");
    }

    @Override
    public void pokazInformacje() {
        System.out.println("Inforamcje na temat sokoła: ");
        System.out.println("Gatunek: " + super.getGatunek());
        System.out.println("Nazwa: " + super.getNazwa());
        System.out.println("Wiek: " + super.getWiek());
        System.out.println("Prędkość latania: " + this.predkoscLatania);
        System.out.println("Wysokość latania: " + this.wysokosc);


    }
    public Sokol(String nazwa, String gatunek, int wiek, int wysokosc, int predkoscLatania){
        super(nazwa, gatunek , wiek);
        this.wysokosc = wysokosc;
        this.predkoscLatania = predkoscLatania;
    }

    @Override
    public void Atakuj() {
        System.out.println("Sokół atakuje");
    }
}
