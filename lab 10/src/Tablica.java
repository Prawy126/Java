import java.util.Random;
//zadanie 1
public class Tablica {
    private int[] tab;
    private Random random;
    private int index;

    public Tablica(int index) {
        tab = new int[index];
        this.index = index;
        random = new Random();
    }

    public void losuj() {
        for (int i = 0; i < index; i++) {
            tab[i] = random.nextInt();
        }
    }

    public void wypisz() {
        for (int i = 0; i < tab.length; i++) {
            System.out.println(tab[i]);
        }
    }

    public void sortuj() {
        boolean pomoc = true;
        int chwila;
        while (pomoc) {
            pomoc = false;
            for (int i = 1; i < tab.length; i++) {
                if (tab[i - 1] > tab[i]) {
                    chwila = tab[i];
                    tab[i] = tab[i - 1];
                    tab[i - 1] = chwila;
                    pomoc = true;
                }
            }
        }
    }
}
