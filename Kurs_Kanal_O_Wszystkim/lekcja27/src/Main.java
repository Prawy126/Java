public class Main {
    public static void main(String[] args) {

        System.out.println(Poruszanie.nazwaInterfejsu);

        Samochod car = new Samochod("BMW",4);
        car.jedzDoPrzodu();
        car.skrecaj();
        System.out.println("Ilość kół: " + car.iloscKol);
        
    }
}