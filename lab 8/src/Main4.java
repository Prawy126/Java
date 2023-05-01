public class Main4 {
    public static void main(String[] args){
        //zadanie 4
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
        Szescian szescian = new Szescian(4);
        szescian.obliczPole();
        szescian.obliczObjetosc();
        System.out.println(szescian.toString());
        Prostopadloscian prostopadloscian = new Prostopadloscian(2,3,4);
        prostopadloscian.obliczObjetosc();
        prostopadloscian.obliczPole();
        System.out.println(prostopadloscian.toString());
        Kula kula = new Kula(4);
        kula.obliczObjetosc();
        kula.obliczPole();
        System.out.println(kula.toString());
        Stozek stozek = new Stozek(2,1,5);
        stozek.obliczObjetosc();
        stozek.obliczPole();
        System.out.println(stozek.toString());
        Walec walec = new Walec(2,5);
        walec.obliczObjetosc();
        walec.obliczPole();
        System.out.println(walec.toString());
        //zadanie 5
        Object[] figura = {new Kolo(2),new Kolo(4), new Prostopadloscian(2,3,4),new Szescian(4),new Prostokat(4,2),new Romb(4,2,5,6),new Rownoleglobok(6,6,2),new Stozek(6,3,8),new Trapez(1,23,4,56,3),new Walec(5,2)};
        int i = 0;
        System.out.println("------------------------------\n-------------------------------");
        while(i< figura.length){
            System.out.println(figura[i].toString());
            i++;
        }
    }
}
