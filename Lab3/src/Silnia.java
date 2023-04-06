import java.util.Scanner;

public class Silnia {
    public static void main(String[] args)
    {
        Scanner zmienna = new Scanner(System.in);
        System.out.print("Podaj liczbę: ");
        int x=1,zmienna1 = zmienna.nextInt();
        for(int i=1;i<=zmienna1;i++)
        {
            x=i*x;

        }
        System.out.println(zmienna1 + "! = " + x);
    }
}
