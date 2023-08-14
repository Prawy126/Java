public class Test {
    public static void main(String[] args){
        Rozgrywka rozgrywka = new Rozgrywka();
        char tab[][] = new char[3][3];
        tab[2][2] = 'x';
        tab[1][2] = 'x';
        tab[0][2] = 'x';
        for(int i = 0; i < 3;i++){
            for(int j = 0; j < 3; j++){
                System.out.print(tab[i][j]);
            }
            System.out.println();
        }
        tab = rozgrywka.czyszsczenie(tab);
        System.out.println(rozgrywka.wygrana(tab));
        for(int i = 0;i < 3;i++){
            for(int j = 0;j < 3; j++){
                    System.out.print(tab[i][j]);


            }
            System.out.println();
        }
    }
}
