public class Test {
    public static void main(String[] args){
        Rozgrywka rozgrywka = new Rozgrywka();
        char tab[][] = new char[3][3];
        tab[0][0] = 'x';
        tab[0][1] = 'x';
        tab[1][2] = 'x';
        tab[1][0] = 'O';
        tab[1][1] = 'O';
        tab[0][2] = 'O';
        tab[2][0] = 'X';
        tab[2][1] = 'O';
        tab[2][2] = 'X';
        for(int i = 0; i < 3;i++){
            for(int j = 0; j < 3; j++){
                System.out.print(tab[i][j]);
            }
            System.out.println();
        }
        if(rozgrywka.sprawdzCzyRemis(tab)){
            System.out.println("remis");
        }else{
            System.out.println(rozgrywka.kto(tab));
        }
        int sprawdz = 0;
        for(int i = 0;i <3;i++){
            for(int j = 0;j < 3; j++){
                if(tab[i][j]!='\u0000'){
                    sprawdz++;
                }
            }
        }
        System.out.println(sprawdz);

    }
}
