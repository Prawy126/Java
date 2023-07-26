public class Main {
    public static void main(String[] args) {
        int liczba = 50;
        int liczba2 = liczba;
        System.out.println("Liczba przed: " + liczba);
        zmien(liczba);
        System.out.println("Liczba po: " + liczba);
        liczba2=111;
        Liczba oliczba = new Liczba();
        oliczba.liczba = 50;
        Liczba oliczba2 = new Liczba();
        oliczba2.liczba =111;
        System.out.println("Liczba przed: " + oliczba.liczba);
        zmien(oliczba);
        System.out.println("Liczba po: " + oliczba.liczba);

    }
    public static void zmien(int liczba){
        liczba = -1;
    }
    public static void zmien(Liczba oliczba){

        oliczba.liczba = -1;
    }
}