public class Main {
    public static void main(String[] args) {

        Czlowiek Jan = new Czlowiek("Jan");
        //Jan.imie = "Jan";
        System.out.println(Czlowiek.liczebnosc);
        System.out.println(Jan.imie);


        Czlowiek daniel = new Czlowiek();
        daniel.imie = "Daniel";
        System.out.println(daniel.imie);
        System.out.println(Czlowiek.liczebnosc);

    }
}