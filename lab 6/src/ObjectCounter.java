import java.util.Random;
//zadanie 2S
public class ObjectCounter {
    public static void main(String[] args){
        //tworzenie tablicy obiektów o 10 elemetnach
        Punkt[] p = new Punkt[10];
        Random r = new Random();
        //wypiasanie przez pętle
        for(int i=0; i<10;i++){
            p[i] = new Punkt(r.nextInt(1000),r.nextInt(1000),r.nextInt(1000));
            System.out.println(p[i].toString());
        }
        //wypisananie nadpisaną metodą toString ostatniego obiektu
        System.out.println();
        System.out.println("----------------------------");
        System.out.println(Punkt.last_point.toString());
        //Wypisanie przy użyciu metody PokazOstatniObiekt ostatniego obiektu
        System.out.println("-----------------------------");
        Punkt.PokazOstatniObiekt();
    }
}
