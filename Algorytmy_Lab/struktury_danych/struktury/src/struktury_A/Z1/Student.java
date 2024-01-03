package struktury_A.Z1;

public class Student {
    private String imie, nazwisko;
    private int album;

    public Student() {
        imie = "";
        nazwisko = "";
        album = 0;
    }

    public Student(String imie, String nazwisko, int album) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.album = album;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public int getAlbum() {
        return album;
    }

    public void setAlbum(int album) {
        this.album = album;
    }

    @Override
    public String toString() {
        return "Student{" + "imie=" + imie + ", nazwisko=" + nazwisko + ", album=" + album + '}';
    }
}
