package A.A2_BDB;

class Person implements Comparable<Person>
{
    private String imie, nazwisko;
    private int wiek;

    Person(String imie, String nazwisko, int wiek) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
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

    @Override
    public int compareTo(Person o) {
        if(this.getWiek() > o.getWiek()) return 1;
        else if(this.getWiek() < o.getWiek()) return -1;
        else{
            if(this.getImie().compareTo(o.getImie()) != 0) return this.getImie().compareTo(o.getImie());
            else return this.getNazwisko().compareTo(o.getNazwisko());
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", wiek=" + wiek +
                '}';
    }
}
