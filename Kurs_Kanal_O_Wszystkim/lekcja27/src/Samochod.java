public class Samochod extends Pojazd implements Poruszanie, Comparable<String>{

    Samochod(String nazwa, int iloscKol) {
        super(nazwa);
        this.iloscKol=iloscKol;
    }
    int iloscKol;

    @Override
    public void jedzDoPrzodu() {
        System.out.println("Jadę");
    }

    @Override
    public void skrecaj() {
        System.out.printf("Skręcam");
    }

    @Override
    public int compareTo(String o) {
        return 0;
    }
}
