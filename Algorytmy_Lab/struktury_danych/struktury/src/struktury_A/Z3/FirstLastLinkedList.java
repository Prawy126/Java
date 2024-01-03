package struktury_A.Z3;

/*
 Implementacja listy powiązanej liczb całkowitych (dst – lista powiązana jednostronna, db – lista powiązana dwustronna, bdb
– lista powiązana dwukierunkowa)
 */

// lista powiazana dwustronna
public class FirstLastLinkedList
{
    private ListElem first;  // Referencja do pierwszego elementu listy
    private ListElem last;   // Referencja do ostatniego elementu listy

    public FirstLastLinkedList()  // Konstruktor
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
        ListElem newElem = new ListElem(value);
        if(isEmpty()) last = newElem;
        newElem.next = first;
        first = newElem;
    }

    public void insertLast(int value)   // Wstawienie na koniec listy
    {
        ListElem newElem = new ListElem(value);
        if (isEmpty()) first = newElem;
        else last.next = newElem;
        last = newElem;
    }

    public ListElem deleteFirst()     // Usunięcie pierwszego elementu listy
    {
        if (isEmpty()) return null;
        ListElem temp = first;
        if(first.next == null) last = null;
        first = first.next;
        return temp;
    }

// -------------------------------------------------------------

    public void print()
    {
        System.out.print("Lista (początek-->koniec): ");
        ListElem current = first;   // Zaczynamy na początku listy
        while (current != null)      // Dopóki nie koniec listy...
        {
            System.out.print(current.toString()+" ");
            current = current.next;  // ...przechodzimy do następnego elementu.
        }
        System.out.println();
    }

    public static void main(String[] args)
    {
        FirstLastLinkedList theList = new FirstLastLinkedList();

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

    }
}
