public class Main {
    public static void main(String[] args) {
        System.out.println("tablica stringów:");
        String[] tab = new String[20];
        tab[0]="Ania";
        tab[1]="Bartek";
        tab[2]="Adam";

        for(int i=0;i<tab.length;i++) {
            System.out.println(tab[i]);

        }
        System.out.println("tablica intów:");
        int[] tab1 = {0,1,2,5,6,10};
        for(int i=0;i<tab1.length;i++)
        {
            System.out.println(tab1[i]);
        }
        System.out.println("tablica intów2: ");
        int[] tab2 = new int[5];
        tab2[0]=2;
        for(int i=0;i<tab2.length;i++)
        {
            System.out.println(tab2[i]);
        }
    }
}