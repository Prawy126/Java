//zadanie 3
public class Samochod {
    private String marka, nazwaSamochodu;
    private int maxPretkosc, cena;
    public Samochod(String marka, String nazwaSamochodu, int maxPretkosc, int cena){
        this.cena = cena;
        this.marka = marka;
        this.maxPretkosc = maxPretkosc;
        this.nazwaSamochodu = nazwaSamochodu;
    }

    public int getMaxPretkosc() {
        return maxPretkosc;
    }
    public void setMaxPretkosc(int maxPretkosc){
        this.maxPretkosc = maxPretkosc;
    }

    public int getCena() {
        return cena;
    }

    public void setMarka(String marka){
        this.marka = marka;
    }

    public String getNazwaSamochodu() {
        return nazwaSamochodu;
    }

    public void setNazwaSamochodu(String nazwaSamochodu){
        this.nazwaSamochodu = nazwaSamochodu;
    }

    public String getMarka() {
        return marka;
    }

    public void setCena(int cena){
        this.cena = cena;
    }
}
