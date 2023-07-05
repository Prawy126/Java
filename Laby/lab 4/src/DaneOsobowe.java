public class DaneOsobowe {
    public static void main(String[] args){
        Osoba osoba1 = new Osoba("Jan","Kowalski", 15);
        osoba1.PokazDane();

        System.out.println("-------------------------------");
        Osoba osoba2 = new Osoba("Adam","Nowak");
        //osoba2.wiek = 70;
        osoba2.PokazDane();

        System.out.println("-----------------------------");
        Osoba osoba3 = new Osoba();
        //osoba3.imie="Anna";
        //osoba3.nazwisko = "Wiśniewska";
        //osoba3.wiek = 45;
        osoba3.PokazDane();

    }
}
