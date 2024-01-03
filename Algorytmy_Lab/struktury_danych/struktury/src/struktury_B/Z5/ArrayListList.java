package struktury_B.Z5;

import java.util.ArrayList;
/*
 Implementacja listy z bezpośrednim dostępem do każdego elementu poprzez podanie jego numeru za pomocą klasy
ArrayList (dst – lista liczb całkowitych, db – lista wartości opakowanych np. klasami Double, Float lub obiektów typu String,
bdb – lista złożonych obiektów zdefiniowanych przez użytkownika, np. tablica osób [imię nazwisko, wiek], książek [tytuł,
wydawnictwo, rok wydania] itp.).
 Wykonać następujący eksperyment ze strukturą w której bierze udział 6 różnych elementów A, B, C, D, E, F (). Przebieg
eksperymentu: tworzymy strukturę, wstawiamy do listy A, B, C, D; wypisujemy elementy listy; usuwamy element drugi i
trzeci; wypisujemy elementy listy; wstawiamy E i F; wypisujemy elementy listy.
 */
public class ArrayListList
{

    private ArrayList<Object> oList;

    public ArrayListList()          // konstruktor
    {
        oList = new ArrayList<Object>();
    }

    public boolean addLast(Object elem)  // dodawanie elementow
    {
        return oList.add(elem);
    }

    public Object removeLast()  // usuwanie elementow
    {
        int lastIndex = oList.size()-1;
        return oList.remove(lastIndex);
    }

    public Object get(int index)  // pobieranie elementu o danym indeksie
    {
        return oList.get(index);
    }

    public int find(Object elem)  // wyszukiwanie elementow
    {
        return oList.indexOf(elem);
    }

    public int size()  // rozmiar listy
    {
        return oList.size();
    }

    public void print()  // wypisywanie listy
    {
        for (int i = 0; i < oList.size(); i++)
        {
            System.out.print(oList.get(i)+" ");
        }
        System.out.println("");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        ArrayListList theList = new ArrayListList();

        theList.addLast("elem0");
        theList.addLast("elem1");
        theList.addLast("elem2");
        theList.addLast("elem3");
        theList.addLast("elem4");

        theList.print();
        System.out.println("");

        System.out.println(theList.get(3));
        System.out.println("");

        theList.print();
        System.out.println("");

        System.out.println(theList.removeLast());
        System.out.println("");

        System.out.println(theList.find("elem4"));
        System.out.println("");

        theList.print();
        System.out.println("");
    }

}
