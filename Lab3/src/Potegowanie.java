import java.util.Scanner;


public class Potegowanie {
    public static int potega(int podstawa, int potega){
        int wynik = 1;
        for(int i=1;i<potega;i++)
        {
            wynik=wynik*podstawa;
        }
        return wynik;
    }
    public static int potega2(int podstawa, int potega){
        int wynik=1;
        if(potega == 0) return wynik;
        else return podstawa * potega2(podstawa,potega-1);
    }
    public static void main(String[] args)
    {
        int pomoc;
        int podstawa, potega;
        Scanner x = new Scanner(System.in);
        System.out.println("1) potęgowanie iteracyje");
        System.out.println("2) potęgowanie rekurencyjne");
        System.out.println("Podaj opcję którą chcesz wykonać: ");
        pomoc = x.nextInt();
        switch(pomoc){
            case 1:

                System.out.println("Podaj podstawę: ");
                podstawa = x.nextInt();
                System.out.println("Podaj potęgę: ");
                potega = x.nextInt();
                System.out.println(potega(podstawa,potega));
                break;
            case 2:
                System.out.println("Podaj podstawę: ");
                podstawa = x.nextInt();
                System.out.println("Podaj potęgę: ");
                potega = x.nextInt();
                System.out.println(potega2(podstawa,potega));
                break;



        }


    }
}
