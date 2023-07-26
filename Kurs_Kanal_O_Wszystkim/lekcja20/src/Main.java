import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        LinkedList<String> lista = new LinkedList<>();
        lista.add("Ponzań");
        lista.add("Warszawa");
        lista.add("Warszawa");
        if(lista.contains("Poznań")==false) {
            lista.add("Poznań");
        }
       // lista.remove(0);
        for(String e:lista)
        {
            System.out.println(e);
        }
        System.out.println(lista.size());
        lista.clear();

        HashMap<Integer,String> mapa = new HashMap<>();
        mapa.put(1,"Poniedziałek");
        mapa.put(5,"Piątek");
        mapa.put(7,"Niedziela");

        System.out.println(mapa.get(1));

        for(String e: mapa.values()){
            System.out.println(e);
        }
        LinkedHashSet<String> zbior = new LinkedHashSet<>();
        zbior.add("Warszawa");
        zbior.add("Poznań");
        zbior.add("Szczecin");
        zbior.add("Szczecin");

        for(String e : zbior)
        {
            System.out.println(e);
        }

        System.out.println(zbior.size());
    }
}