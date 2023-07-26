import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> lista = new ArrayList<>();
        lista.add("Poznań");
        lista.add("Warszawa");
        lista.add("Gdańsk");
        lista.add("Szczeciń");

        for(String e : lista){
            System.out.println(e);
        }
        System.out.println();
        Collections.sort(lista);
        for(String e : lista){
            System.out.println(e);
        }
        System.out.println();
        System.out.println(Collections.min(lista));
        System.out.println(Collections.max(lista));
        Collections.reverse(lista);
        System.out.println();
        for(String e : lista){
            System.out.println(e);
        }

        System.out.println();
        Collections.shuffle(lista);
        for(String e : lista){
            System.out.println(e);
        }

        ArrayList<Animal> koty = new ArrayList<Animal>();

        Animal kot1 = new Animal("Bury");
        Animal kot2 = new Animal("Rudy");
        Animal kot3 = new Animal("Biały");
        Animal kot4 = new Animal("Biały");
        kot3.wiek = 10;

        koty.add(kot1);
        koty.add(kot2);
        koty.add(kot3);
        koty.add(kot4);

        System.out.println();
        for(Animal kot: koty){
            System.out.println(kot.name + " " + kot.wiek + " lat");
        }
        System.out.println();
        Collections.sort(koty);

        for(Animal kot: koty){
            System.out.println(kot.name + " " + kot.wiek + " lat");
        }

    }
}