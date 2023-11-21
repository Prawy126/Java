package Monte_Carlo;

import java.util.Random;

public class Pole_Figury {
    public static void main(String[] args) {
        Random rand = new Random();
    int pole = 0;

        for(int i=0; i<100; i++){
        //tutaj wpisz ile losowych punktów
        double x = (double) rand.nextInt(100+1)/100;
        double y = (double) rand.nextInt(100+1)/100;
        //tutaj wpisz wzór
        if(y<=Math.pow(x,2)){
            pole++;
        }
    }
    //stosunek zlicznonego pola do ilości losów
        System.out.println("Pole figury: " + (float) pole / 100);
}
}
