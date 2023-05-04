import java.util.ArrayList;
import java.util.List;
//zadanie 3
public class Main3 {
    public static void main(String[] args) {
        Samochod samochod1 = new Samochod("Audi", "A4",250,2000000);
        Samochod samochod2 = new Samochod("BMW", "E36", 320,500000);
        List<Samochod> lista = new ArrayList<Samochod>();
        lista.add(samochod1);
        lista.add(samochod2);
        for(Object i: lista){
            System.out.println("Marka: " + ((Samochod)i).getMarka());
            System.out.println("Model: " + ((Samochod)i).getNazwaSamochodu());
            System.out.println("Cena: " + ((Samochod)i).getCena());
            System.out.println("Maksymalna prędkość: " + ((Samochod)i).getMaxPretkosc());
        }
    }
}

