//zadanie 5
public class Pracownik {
    private String imie;
    private String nazwisko;
    private int wiek;
    private String stanowisko;

    public Pracownik(String imie, String nazwisko, int wiek, String stanowisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
        this.stanowisko = stanowisko;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public int getWiek() {
        return wiek;
    }

    public String getStanowisko() {
        return stanowisko;
    }

    public String toString() {
        return imie + " " + nazwisko + ", " + wiek + " lat, " + stanowisko;
    }
}
