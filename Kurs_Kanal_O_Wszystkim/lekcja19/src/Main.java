import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Animal kot1 = new Animal("Rudy");
        Animal kot2 = new Animal("Bury");
        Animal kot3 = new Animal("Biały");

        ArrayList list =  new ArrayList();

        list.add(kot1);
        list.add(kot2);
        list.add(kot3);

        System.out.println("-----------------------");

        for(Object k: list){
            System.out.println(((Animal)k).imie);
        }

        System.out.println("-----------------------");

        System.out.println(((Animal)list.get(0)).imie);
        System.out.println(list.size());
        System.out.println(list.contains(kot1));
        list.remove(kot2);
       // list.remove(0);
        //list.clear();
        System.out.println("-----------------------");

        for(Object k: list){
            System.out.println(((Animal)k).imie);
        }

        System.out.println("-----------------------");


        ArrayList<Animal> listaG = new ArrayList<Animal>();
        listaG.add(kot1);
        listaG.add(kot2);
        listaG.add(kot3);

        System.out.println("-----------------------");

        for(Animal k: listaG){
            System.out.println(k.imie);
        }

        System.out.println("-----------------------");

        System.out.println((listaG.get(0)).imie);
        System.out.println(listaG.size());
        System.out.println(listaG.contains(kot1));
        listaG.remove(kot2);
        //listaG.remove(0);
        //listaG.clear();
        System.out.println("-----------------------");

        for(Animal k: listaG){
            System.out.println(k.imie);
        }

        System.out.println("-----------------------");

       System.out.println(listaG.get(0).imie);
       System.out.println(((Animal)list.get(0)).imie);

    }
}