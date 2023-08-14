public class Rozgrywka {
    public boolean wygrana(char tab[][]) {
        for (int i = 0; i < 3; i++) {
            if (tab[0][i] != '\u0000' && tab[0][i] == tab[1][i] && tab[1][i] == tab[2][i]) {
                return true;
            } else if (tab[i][0] != '\u0000' && tab[i][0] == tab[i][1] && tab[i][1] == tab[i][2]) {
                return true;
            }
        }

        if (tab[1][1] != '\u0000' && ((tab[0][0] == tab[1][1] && tab[1][1] == tab[2][2]) || (tab[0][2] == tab[1][1] && tab[1][1] == tab[2][0]))) {
            return true;
        }

        return false;
    }

    public char kto(char tab[][]) {
        char wynik;
        for (int i = 0; i < 3; i++) {
            if (tab[0][i] != '\u0000' && tab[0][i] == tab[1][i] && tab[1][i] == tab[2][i]) {
                wynik = tab[0][i];
                return wynik;
            } else if (tab[i][0] != '\u0000' && tab[i][0] == tab[i][1] && tab[i][1] == tab[i][2]) {
                wynik = tab[0][i];
                return wynik;
            }
        }

        if (tab[1][1] != '\u0000' && ((tab[0][0] == tab[1][1] && tab[1][1] == tab[2][2]) || (tab[0][2] == tab[1][1] && tab[1][1] == tab[2][0]))) {
            wynik = tab[1][1];
            return wynik;
        }

        return '\u0000';
    }
    public boolean sprawdzCzyRemis(char[][] tab){
        boolean odpowiedz;
        if(wygrana(tab)){
            return false;
        }
        int sprawdz = 0;
        for(int i = 0;i < 3;i++){
            for(int j = 0;j < 3; j++){
                if(tab[i][j]!='\u0000'){
                    sprawdz++;
                }
            }
        }
        if(sprawdz == 9){
            return true;
        }else return false;
    }
    public char[][] czyszsczenie(char[][] tab){
        for(int i = 0;i < 3;i++){
            for(int j = 0;j < 3; j++){
                    tab[i][j] = '\u0000';

            }
        }
        return tab;
    }
}

