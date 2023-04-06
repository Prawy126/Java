import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int x,pomoc=1,pomoc2;
        System.out.println("Podaj długość tablicy: ");
        Scanner podaj = new Scanner(System.in);
        x = podaj.nextInt();
        int[] tab = new int[x];
        for(int i=0;i<x;i++)
        {
            System.out.print("tab["+i+"] = ");
            tab[i]=podaj.nextInt();
            System.out.println();
        }
        while(pomoc!=0)
        {
            for(int i=0;i<x-1;i++)
            {
                if(tab[i]>tab[i+1])
                {
                    pomoc2=tab[i];
                    tab[i]=tab[i+1];
                    tab[i+1]=pomoc2;
                    pomoc=1;
                    break;
                }
                else{
                    pomoc=0;
                }
            }
        }

        for(int i=0;i<x;i++)
        {
            System.out.println(tab[i]);

        }


    }
}