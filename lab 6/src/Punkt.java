//zadanie 2
public class Punkt {
    //inicjalizacja zmiennych
    private int x, y, z;

    private static int counter;
    public static Punkt last_point;
    //tworzenie obiektu
    public Punkt (int x, int y, int z){
        this.x = x;
        this.y = y;
        this.z = z;
        counter++;
        last_point = this;
    }
    //metoda wypisująca działanie obiektu
    public static void PokazOstatniObiekt(){
        System.out.println("Klasa Punkt o współrzędnych (x=" + last_point.x + " y=" + last_point.y + "  z=" + last_point.z + "). Isnieje już " + last_point.counter + " okiekty tej klasy.");
    }
    @Override
    //nadpisanie metody która zwraca Stringa który jest opisem tego co zrobił obiekt Punkt;
    public String toString(){
        String s = "Klasa Punkt o współrzędnych (x=" + last_point.x + " y=" + last_point.y + "  z=" + last_point.z + "). Isnieje już " + last_point.counter + " okiekty tej klasy.";
        return s;
    }
}
