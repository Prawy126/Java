public class Gracz {
    private char znak;
    private String nazwa;
    private float wynik = 0;
    public Gracz(String nazwa, char znak){
        this.nazwa = nazwa;
        this.znak = znak;
    }
    public float getWynik(){
        return wynik;
    }
    public String getNazwa(){
        return nazwa;
    }
    public void setNazwa(String nazwa){
        this.nazwa = nazwa;
    }
    public char getZnak(){
        return znak;
    }
    public void setZnak(char znak){
        this.znak = znak;
    }
    public void wygrana(){
        wynik ++;
    }
    public void remis(){
        wynik = wynik+0.5f;
    }
}
