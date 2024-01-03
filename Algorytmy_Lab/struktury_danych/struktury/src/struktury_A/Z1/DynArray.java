package struktury_A.Z1;
/*Treść zadania
 Implementacja tablicy dynamicznej (dst – tablica liczb całkowitych, db – tablica wartości opakowanych np. klasami Integer,
Double, Float lub obiektów typu String, bdb – tablica złożonych obiektów zdefiniowanych przez użytkownika, np. tablica osób
[imię nazwisko, wiek], książek [tytuł, wydawnictwo, rok wydania] itp.) */
// Implementacja tablicy dynamicznej obiektow typu Object

public class DynArray
{
    private Object [] table;  //Referencja do tablicy
    private int nElems;  //Aktualna liczba elementow w tablicy

    public DynArray(int maxSize)  // Konstruktor
    {
        table = new Object[maxSize]; // Tworzymy tablice
        nElems = 0;               // Na razie brak elementow w tablicy
    }

    public void add(Object value)    	// Wstawienie elementu do tablicy
    {
        if (nElems >= table.length)
        {
            Object [] locTable = new Object[table.length*2];
            for (int i=0; i<table.length; i++) locTable[i]=table[i];
            // LUB: System.arraycopy(table, 0, locTable, 0, table.length);
            table = locTable;
        }

        table[nElems] = value;       	// Wstawiamy element
        nElems++;                      	// Zwiekszamy licznik elementow
    }

    public Object get(int index) // Pozyskanie elementu o danym indeksie
    {
        return table[index];
    }

    public int size() // Aktualna liczba elementow w tablicy
    {
        return nElems;
    }

    public boolean remove(int index) 	// Usuniecie elementu o danym indeksie
    {
        if (nElems==0 || index>=nElems || index<0)
            return false;
        for (int j = index; j < nElems-1; j++) 	// Przesuwamy pozostale elementy w lewo
        {
            table[j] = table[j + 1];
        }
        nElems--;                   		// Zmniejszamy licznik elementow
        return true;
    }

    public int find(Object searchElem) // Szukanie okreslonego elementu
    {
        for (int j = 0; j < nElems; j++)
        {
            if (table[j].equals(searchElem)) return j; //Element znaleziono
        }
        return -1; // Elementu nie znaleziono
    }

    public void print()
    {
        for (int i = 0; i < nElems; i++)
            System.out.print(get(i).toString()+" ");
        System.out.println();
    }

    public static void main(String[] args)
    {
        int maxSize = 5;
        DynArray array = new DynArray(maxSize);

        array.add("Ala");
        array.add("Ola");
        array.add("Tola");
        array.print();
        array.remove(1);
        array.print();
        array.add("Lolek");
        array.print();
        array.add(123);
        array.print();
        array.add(123.123);
        array.print();
        array.add(true);
        array.print();
        array.add('s');
        array.print();
    }
}
