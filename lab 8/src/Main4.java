public class Main4 {
    public static void main(String[] args){
        Kwadrat kwadrat = new Kwadrat(4);
        kwadrat.obliczPole();
        kwadrat.obliczObwod();
        System.out.println(kwadrat.toString());
        Prostokat prostokat = new Prostokat(2,3);
        prostokat.obliczObwod();
        prostokat.obliczPole();
        System.out.println(prostokat.toString());
        Trojkat trojkat = new Trojkat(2,5);
        trojkat.obliczObwod();
        trojkat.obliczPole();
        System.out.println(trojkat.toString());
        Trapez trapez = new Trapez(2, 5,4,4,5);
        trapez.obliczObwod();
        trapez.obliczPole();
        System.out.println(trapez.toString());
        Rownoleglobok rownoleglobok = new Rownoleglobok(4,6,3);
        rownoleglobok.obliczObwod();
        rownoleglobok.obliczPole();
        System.out.println(rownoleglobok.toString());
        Romb romb = new Romb(1,2,4,5);
        romb.obliczObwod();
        romb.obliczPole();
        System.out.println(romb.toString());
        Kolo kolo = new Kolo(5);
        kolo.obliczObwod();
        kolo.obliczPole();
        System.out.println(kolo.toString());
    }
}
