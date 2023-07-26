public class Main {
    public static void main(String[] args) {

        //Obliczenia ob1 = new Obliczenia();
        //Obliczenia ob2 = new Obliczenia();
        //implementacja wielowątkowości
        //ob1.start(); nie działa bo aktualnie nie dziedziczymy z klasy Thread tylko z klasy abstrakcyjnej
        //dwa różne obliczenia
        Thread ob1 = new Thread(new Obliczenia());
        Thread ob2 = new Thread(new Obliczenia());

        ob1.start();
        ob2.run();
        ob1.run();

    }
}