public class Kalkulator {
    public static void main(String[] args) {
        Kolo kolo1 = new Kolo(6);
        kolo1.pokaz();
        Kwadrat kwadrat1 = new Kwadrat(5);
        kwadrat1.wyswietl();
        Prostokat prostokat1 = new Prostokat(3,5);
        prostokat1.pokaz();
        Szescian szescian1 = new Szescian(4);
        szescian1.wypisz();
        Kula kula1 = new Kula(13);
        kula1.wypisz();
        Stozek stozek1 = new Stozek(2,12);
        stozek1.wypisz();

    }
}
