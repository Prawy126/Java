public class Student extends Osoba{
    private int nrIndexu, rok;
    private String typStudiow, kierunek;

    Student(String imie, String nazwisko, String plec, int dzien, int numerMiesiaca, int rokUrodzenia, int nrIndexu, int rok, String typStudiow,
            String kierunek){
        super(imie, nazwisko, plec, dzien, numerMiesiaca, rokUrodzenia);
        this.kierunek = kierunek;
        this.rok = rok;
        this.nrIndexu = nrIndexu;
        this.typStudiow = typStudiow;
    }
    @Override
    void wyswietl(){
        super.wyswietl();
        System.out.println("Kierunek: " + this.kierunek);
        System.out.println("Typ studiów: " + this.typStudiow);
        System.out.println("Numer indexu: " + this.nrIndexu);
        System.out.println("Rok rozpoczecia: " + this.rok);
    }
}
