public class Osoba {
    private float wzrost, waga;
    private int wiek;
    private String imie, nazwisko;
    public String  getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public float getWaga() {
        return waga;
    }

    public void setWaga(float waga) throws NegativeNumberException{
        if(waga<0) throw new NegativeNumberException("Ujemna waga");
        else
        this.waga = waga;
    }

    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }



    public float getWzrost() {
        return wzrost;
    }

    public void setWzrost(float wzrost) {
        this.wzrost = wzrost;
    }
}
