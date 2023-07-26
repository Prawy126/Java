public class Main {
    public static void main(String[] args) {

        Uczen u1 = new Uczen();

        u1.setNazwisko("Nowak");
        System.out.println(u1.getNazwisko());
        u1.setNazwisko("d");
        System.out.println(u1.getNazwisko());
        u1.setOcena(6);
        u1.setOcena(9);

        System.out.println("Ocena: " + u1.getOcena());
    }
}