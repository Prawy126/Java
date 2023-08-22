import java.util.Random;

public class Bot {
    private Random random = new Random();
    private Ruch ruch;
    public Ruch latwy(char tab[][], char znak){

        int x = losowanie(), y = losowanie();
        if(sprawdzCzyWolne(tab,x,y)){
            tab[x][y]=znak;
        }else{
            x = losowanie();
            y = losowanie();
            latwy(tab,znak);
        }
        ruch = new Ruch(x,y,znak);
        return ruch;
    }

    private int losowanie(){


        return Math.abs(random.nextInt()%3);
    }

    private boolean sprawdzCzyWolne(char tab[][], int a, int b){
        if(tab[a][b] == 'X'||tab[a][b]=='O'){
            return false;
        }else {
            return true;
        }
    }
}
