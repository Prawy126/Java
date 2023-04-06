import java.util.Random;
//zadanie 3
public class Stos {
    private Random x = new Random();
    private int[] stos;
    private int dlugosc,pomoc = 0,pomoc2;

    Stos(int wielkosc){
        stos =new int[wielkosc];
        this.dlugosc = wielkosc-1;
        for(int i = 0; i<wielkosc;i++){
            stos[i] = 0;
        }
        this.pomoc2 = wielkosc;

    }
    void push(int a){
        for(int i = 0; i<this.dlugosc;i++){
            if(stos[i]==0){
                stos[i]=a;

            }

        }
        this.pomoc++;
        if(this.dlugosc<this.pomoc-1){
            System.out.println("Stos został przepchany");
        }
    }

    void pop(){

        for(int i = this.dlugosc-1;i>0;i--){
            if(stos[i]!=0)
                stos[i]=0;
        }
        this.pomoc2--;
        if(this.pomoc2<0){
            System.out.println("Stos jest już pusty a ty prubujesz go wyczyścić");
        }
    }
}
