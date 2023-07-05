import java.util.Scanner;

import static java.lang.System.exit;

public class Main {
    public static void main(String[] args) {
        int pomoc;
        double[]tab=new double[10];
        do{
            System.out.println("1)Podaj tablicę.");
            System.out.println("2) Wyświetlanie tablicy od pierwszego do ostatniego indeksu.");
            System.out.println("3) Wyświetlanie tablicy od ostatniego do pierwszego indeksu");
            System.out.println("4) Wyświetl element nieparzysty");
            System.out.println("5) Wyświetl element parzysty");
            System.out.println("6) Wyjście");


            Scanner odp = new Scanner(System.in);
            pomoc = odp.nextInt();
            if(pomoc==1){
                Scanner a = new Scanner(System.in);
                for(int i=0;i<10;i++)
                {
                    System.out.println("Pozycja "+ i+ " : ");
                    tab[i] = a.nextDouble();

                }
            }else if(pomoc == 2){
        for(int i=0;i<10;i++)
        {
            System.out.println(tab[i]);
        }}else if(pomoc == 3){
        for(int i=9;i>0;i--)
        {
            System.out.println(tab[i]);
        }}else if(pomoc == 4){
        for(int i=1;i<9;i++)
        {
            i++;
            System.out.println(tab[i]);
        }}else if(pomoc == 5){
        for(int i=0;i<10;i++)
        {
            i++;
            System.out.println(tab[i]);
        }}else if(pomoc == 6)
            {
                exit(0);
            }else {
                System.out.println("Podana opcja jest z poza zakresu");
            }
        }while(true);

    }


}