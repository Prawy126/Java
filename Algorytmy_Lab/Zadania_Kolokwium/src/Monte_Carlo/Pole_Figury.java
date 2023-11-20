package Monte_Carlo;

import java.util.Random;

public class Pole_Figury {
    public static void main(String[] args) {
        Random rand = new Random();
        int pole = 0;

        for(int i=0; i<100; i++){
            double x = (double) rand.nextInt(100+1)/100;
            double y = (double) rand.nextInt(100+1)/100;

            if(y<=Math.pow(x,2)){
                pole++;
            }
        }

        System.out.println("Pole figury: " + (float) pole / 100);
    }
}
