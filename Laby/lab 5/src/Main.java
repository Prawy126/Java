//zadnie 2
public class Main {
    public static void main(String[] args) {

        Ksiazka ksiazka = new Ksiazka("Lalka","Prus",1233, 1700,123.42f);
        ksiazka.wyswietlKsiazke();
        System.out.println("------------------------");
        System.out.println("Nowa zmiana ceny");
        ksiazka.nowaCena(123.99f);
        ksiazka.wyswietlKsiazke();
        ksiazka.podajCene();
        ksiazka.wyswietlKsiazke();
    }
}