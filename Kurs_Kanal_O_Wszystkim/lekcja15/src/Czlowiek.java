public class Czlowiek {
    Czlowiek(){

        liczebnosc++;
    }
    Czlowiek(String imie){
        this.imie = imie;
        liczebnosc++;
    }
    String imie;
    static int liczebnosc = 0;



}
