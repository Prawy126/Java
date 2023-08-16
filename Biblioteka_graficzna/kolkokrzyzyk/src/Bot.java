import java.util.Random;

public class Bot {
    public char[][] latwy(char tab[][], char znak){
        int x = losowanie(), y = losowanie();
        if(sprawdzCzyWolne(tab,x,y)){
            tab[x][y]=znak;
        }else{
            x = losowanie();
            y = losowanie();
            latwy(tab,znak);
        }
        return tab;
    }

    private int losowanie(){
        Random random = new Random();
        return random.nextInt();
    }

    private boolean sprawdzCzyWolne(char tab[][], int a, int b){
        if(tab[a][b] == '\u0000'){
            return true;
        }else {
            return false;
        }
    }
}
