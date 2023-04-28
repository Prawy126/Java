public class Main4 {
    public static void main(String[] args){
        Kwadrat kwadrat = new Kwadrat(4);
        kwadrat.obliczPole();
        kwadrat.obliczObwod();
        kwadrat.wyswietlInformacje();
        Prostokat prostokat = new Prostokat(2,3);
        prostokat.obliczObwod();
        prostokat.obliczPole();
        prostokat.wyswietlInformacje();
        Trojkat trojkat = new Trojkat(2,5);
        trojkat.obliczObwod();
        trojkat.obliczPole();
        trojkat.wyswietlInformacje();
        Trapez trapez = new Trapez(2, 5,4,4,5);
        trapez.obliczObwod();
        trapez.obliczPole();
    }
}
