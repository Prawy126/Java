public class Main {
    public static void main(String[] args) {
/*        Tablica tablica = new Tablica(3);
        tablica.wprowadz();
        System.out.println("Średnia " + tablica.srednia());
        tablica.wyswietl();
*/
        Osoba osoba = new Osoba("Tomek","Nowak",19,71,189);
        osoba.wyswietl();
        System.out.println("-------------------------------------------------");
        Pracownik pracownik = new Pracownik("Robert", "Kowalski","Budowlaniec", 3900);
        pracownik.wyswietl();
    }
}