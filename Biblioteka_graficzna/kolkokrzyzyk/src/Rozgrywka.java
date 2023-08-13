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
}

