package Zadanie3;

public class Main {
    public static void main(String[] args) {
        Tuple3<Integer,String,Float> krotka = new Tuple3(21, "tak", 2.4f);
        System.out.println(krotka.getT1());
        String tekst = krotka.getT2();
        System.out.println(tekst);
        float liczba = 2.3f;
        System.out.println(liczba+ krotka.getT3());
    }
}
