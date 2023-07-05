import java.util.Random;
import java.util.TreeSet;
//zadanie 2
public class Tree {
    private int ile;
    private TreeSet<Integer> tree = new TreeSet<Integer>();

    public Tree(int ile){
        Random random = new Random();
        for(int i = 1; i <=ile; i++){
            tree.add(random.nextInt());
        }
        this.ile = ile;
    }

    public void wypisz(){
        for(Integer a : tree){
            System.out.println(a);
        }
    }
}

