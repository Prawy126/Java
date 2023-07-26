

public class Main {
    public static void main(String[] args) {

        Zwierze kot= new Zwierze();
        System.out.println(Zwierze.liczebnosc);
        kot.glos = "Meeeow";
        kot.imie = "Milka";
        kot.przedstawSie();
        kot.dajGlos(3);

        Zwierze pies = new Zwierze();
        pies.imie = "Reksio";
        pies.przedstawSie();
        System.out.println(Zwierze.liczebnosc);
    }
}


