package struktury_A.Z3;

/*
 Implementacja listy powiązanej liczb całkowitych (dst – lista powiązana jednostronna, db – lista powiązana dwustronna, bdb
– lista powiązana dwukierunkowa)
 */

// lista powiazana dwukierunkowa
public class DoublyLinkedList
{
    private DListElem first;  // Referencja do pierwszego elementu listy
    private DListElem last;   // Referencja do ostatniego elementu listy

    public DoublyLinkedList()  // Konstruktor
    {
        first = null;    // Lista nie ma jeszcze elementów
        last = null;
    }

    public boolean isEmpty()       // Zwraca true, jeżeli lista jest pusta
    {
        return (first == null);
    }

    public void insertFirst(int value) // Wstawienie na poczatek listy
    {
        DListElem newElem = new DListElem(value);

        if(isEmpty()) last = newElem; //Wstawiamy pierwszy element listy
        else first.previous = newElem; //Poprzedni pierwszego to teraz nowy element

        newElem.next = first; //Nastepnym elementem wstawionego jest byly pierwszy
        first = newElem; //Wstawiony staje sie pierwszym
    }

    public void insertLast(int value)   // Wstawienie na koniec listy
    {
        DListElem newElem = new DListElem(value);
        if (isEmpty()) first = newElem; //Wstawiamy pierwszy element listy
        else
        {
            last.next = newElem; //Nastepny ostatniego to nowy element
            newElem.previous = last; //Poprzedni wstawionego to byly ostatni
        }
        last = newElem; //Wstawiony staje sie ostatnim
    }


    public DListElem deleteFirst()     // Usunięcie pierwszego elementu listy
    {
        if (isEmpty()) return null;

        DListElem temp = first;
        if(first.next == null) last = null; //Byl tylko jeden element na liscie
        else first.next.previous = null; //Drugi element nie bedzie mial poprzednika
        first = first.next; //Pierwszym elementem bedzie byly drugi element
        return temp;
    }

    public DListElem deleteLast()     // Usunięcie ostatniego elementu listy
    {
        if (isEmpty()) return null;

        DListElem temp = last;
        if(first.next == null) first = null; //Byl tylko jeden element na liscie
        else last.previous.next = null; //Przedostatni element nie bedzie mial nastepnika
        last = last.previous; //Ostatnim elementem bedzie bylu przedostatni element
        return temp;
    }

    public void print()
    {
        System.out.print("Lista: ");
        DListElem current = first;   // Zaczynamy na początku listy
        while (current != null)      // Dopóki nie koniec listy...
        {
            System.out.print(current.toString()+" ");
            current = current.next;  // ...przechodzimy do następnego elementu.
        }
        System.out.println();
    }

    public static void main(String[] args)
    {
        DoublyLinkedList theList = new DoublyLinkedList();

        theList.insertFirst(22);       // wstawiamy na początek
        theList.insertFirst(44);
        theList.insertFirst(66);

        theList.insertLast(11);        // wstawiamy na koniec
        theList.insertLast(33);
        theList.insertLast(55);

        theList.print();         // wypisujemy zawartość listy

        theList.deleteFirst();         // usuwamy pierwsze dwa elementy
        theList.deleteFirst();

        theList.print();         // wypisujemy ponownie

        theList.deleteLast(); //usuwamy ostatni element

        theList.print();         // wypisujemy ponownie

    }
}
