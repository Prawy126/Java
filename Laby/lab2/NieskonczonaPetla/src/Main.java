import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Podawaj liczby aż nie opuścisz nieskończonej pętli: ");
        int x;
        Scanner y = new Scanner(System.in);
        while(true)
        {
            x=y.nextInt();
            if(x<0)
            {
                break;
            }
        }
        System.out.println("Udało się opuścić nieskończoną pętlę");

    }
}