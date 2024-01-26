package A.A6_BDB;

import java.util.Iterator;

/*
 Implementacja iteratora dla tablicy mieszajacej IHashTable
 */

public class IHashTableIterator1
{
    private IHashTable1 hashTable; //Tablica mieszjaca dla ktorej jest ten iterator
    private int size; //Rozmiar tablicy mieszajacej
    private int listIndex; //Numer aktualnej listy na ktora wskazuje iterator
    private Iterator listIterator; //Iterator aktualnej listy na ktora wskazuje iterator tablicy mieszajacej

    public IHashTableIterator1(IHashTable1 hashTable)
    {
        this.hashTable = hashTable;
        listIndex = 0;
        size = hashTable.size();
        listIterator = hashTable.getLinkedList(listIndex).iterator();
    }

    public boolean hasNext() //Sprawdzenie, czy w tablicy mieszajacej jest jeszcze nastepny element
    {
        if (listIterator.hasNext()) return true; //Na biezacej liscie jest nastepny element

        int locListIndex = listIndex;
        Iterator locListIterator = listIterator;
        while (true) //Poszukiwanie listy z elementami
        {
            locListIndex++;
            if (locListIndex==size) return false; //Nie znaleziono listy niepustej, zatem brak nastepnego elementu
            locListIterator = hashTable.getLinkedList(locListIndex).iterator(); //Pobranie iteratora dla kolejnej listy
            if (locListIterator.hasNext()) return true; //Znalazl sie nastepny element
        }
    }

    public Object next() //Pobranie kolejnego elementu z tablicy mieszajacej
    {
        if (listIterator.hasNext()) //Czy na aktualnej liscie jest nastepny element
        {
            return listIterator.next(); //Pobranie kolejnego elementu z biezacej listy
        }
        else
        {
            while (!listIterator.hasNext()) //Dopoki list jest pusta (poszukowanie listy niepustej)
            {
                listIndex++;
                if (listIndex==size) return null; //Nie znaleziono listy niepustej, zatem brak nastepnego elementu
                listIterator = hashTable.getLinkedList(listIndex).iterator(); //Pobranie iteratora dla kolejnej listy
            }
            return listIterator.next();
        }
    }
    
}
