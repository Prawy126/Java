package Monte_Carlo;

import java.util.Random;

public class Pole_Figury {
    public static void main(String[] args) {
        Random rand = new Random();
        int pole = 0;

        for (int i = 0; i < 1000; i++) {
            double x = (double) rand.nextInt(1800 + 1) / 1000 + 1.2;
            double y = (double) rand.nextInt(1800 + 1) / 1000 + 1.1;

            if (y <= x * x - x) {
                pole++;
            }
        }

        System.out.println("Pole figury: " + (float) pole / 1000);
    }
}
