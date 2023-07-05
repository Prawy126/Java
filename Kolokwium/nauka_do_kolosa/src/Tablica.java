import java.util.Scanner;

public class Tablica {
    private int[] a;
    Tablica(int i){

        this.a = new int[i];
    }
    private Scanner scanner = new Scanner(System.in);
    public void wprowadz(){
        for(int i = 0; i<a.length;i++){
            System.out.print("Podaj wartość " + i + " indexu: ");
            a[i]=scanner.nextInt();
        }
    }
    public void wyswietl(){
        for(int i = 0; i<a.length;i++){
            System.out.println(i+") " + a[i]);
        }
    }
    private float wynik = 0;
    public float srednia(){

        for(int i = 0; i<a.length;i++){
            wynik = a[i] + wynik;
        }
        return wynik/a.length;
    }

}
