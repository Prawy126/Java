import java.util.ArrayList;
//zadanie 3
public class Main3 {
    static public void main(String[] args) {
        Zakupy ksiazka = new Zakupy("Książka Krzyżacy", 25, "Powiesść średniowieczna");
        Zakupy czekolada = new Zakupy("Czekolada Wedla", 5, "mleczna");
        Zakupy dlugopis = new Zakupy("Długopis", 2, "Czarny długopis");
        Zakupy dzem = new Zakupy("Dżem truskawkowy", 3.2, "dżem truskawkowy");
        Zakupy polopiryna = new Zakupy("Polopiryna", 15, "lek");
        Zakupy dzem2 = new Zakupy("Dżem malinowy", 3.5, "dżem o smaku malin");
        Zakupy czekolada2 = new Zakupy("Czekolada Wedla", 6.99, "czekolada biała");
        Zakupy dlugopis2 = new Zakupy("Długopis" , 1.5,"czarny długopis");
        Zakupy ksiazka2 = new Zakupy("Atlas" , 69.99,"ta książka wie wszystko");
        Zakupy traktor = new Zakupy("Traktor" , 500000,"jeździ");
        ArrayList list = new ArrayList();
        list.add(ksiazka2);
        list.add(ksiazka);
        list.add(dzem);
        list.add(dzem2);
        list.add(polopiryna);
        list.add(czekolada2);
        list.add(czekolada);
        list.add(dlugopis2);
        list.add(dlugopis);
        list.add(traktor);
        for(Object i : list){
            ((Zakupy)i).showInfo();
            System.out.println("-----------------------------------------");
        }

    }
}
