public class Osoba {
    private float wzrost, waga;
    private int wiek;
    private String imie, nazwisko;
    public String  getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko)throws NullPointerException {
        if (nazwisko==null) {
            throw new NullPointerException("Nazwisko nie może być puste.");
        } else {
            this.nazwisko = nazwisko;
        }
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) throws NullPointerException {
        if (imie==null) {
            throw new NullPointerException("Imię nie może być puste.");
        } else {
            this.imie = imie;
        }
    }

    public float getWaga() {
        return waga;
    }

    public void setWaga(float waga) throws NegativeNumberException {
        if (waga < 0) {
            throw new NegativeNumberException("Weight cannot be negative.");
        } else {
            this.waga = waga;
        }
    }
    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek)throws NegativeNumberException {
        if (wiek < 0) {
            throw new NegativeNumberException("Wiek nie może być ujemny");
        } else {
            this.wiek = wiek;
        }
    }



    public float getWzrost() {
        return wzrost;
    }

    public void setWzrost(float wzrost)throws NegativeNumberException {
        if (wzrost < 0) {
            throw new NegativeNumberException("Wzrost nie może być ujemny.");
        } else {
            this.wzrost = wzrost;
        }
    }
}
