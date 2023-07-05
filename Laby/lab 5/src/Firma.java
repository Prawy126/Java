//zadanie 5
public class Firma {
    private Pracownik[] pracownicy;
    private int liczbaPracownikow;

    public Firma() {
        pracownicy = new Pracownik[100];
        liczbaPracownikow = 0;
    }

    public void dodajPracownika(String imie, String nazwisko, int wiek, String stanowisko) {
        if (liczbaPracownikow < 100) {
            pracownicy[liczbaPracownikow] = new Pracownik(imie, nazwisko, wiek, stanowisko);
            liczbaPracownikow++;
            System.out.println("Dodano nowego pracownika: " + imie + " " + nazwisko);
        } else {
            System.out.println("Nie można dodać nowego pracownika - firma osiągnęła maksymalną liczbę pracowników.");
        }
    }

    public void wyswietlListePracownikow() {
        if (liczbaPracownikow == 0) {
            System.out.println("Firma nie zatrudnia obecnie żadnych pracowników.");
        } else {
            System.out.println("Lista pracowników:");
            for (int i = 0; i < liczbaPracownikow; i++) {
                System.out.println((i+1) + ". " + pracownicy[i]);
            }
        }
    }
}
