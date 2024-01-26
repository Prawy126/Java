package A.A3_BDB;

// A3 Implementacja listy powiązanej liczb całkowitch "LinkedList" - BDB

public class LinkedList {
    public ListElem first, last;

    public LinkedList() {
        first = null;
        last = null;
    }

    public boolean isEmpty() {
        return first==null;
    }

    public void insertFirst(int x) {
        ListElem e = new ListElem(x);

        if (isEmpty()) last = e;
        else first.previous = e;
        e.next = first;
        first = e;
    }

    public void insertLast(int x) {
        ListElem e = new ListElem(x);

        if (isEmpty()) first = e;
        else last.next = e;
        e.previous = last;
        last = e;
    }

    public ListElem removeFirst() {
        if (isEmpty()) return null;

        ListElem temp = first;

        if (first.next==null) last = null;
        else first.next.previous = null;
        first = first.next;

        return temp;
    }

    public ListElem removeLast() {
        if (isEmpty()) return null;

        ListElem temp = last;

        if (last.previous==null) first = null;
        else last.previous.next = null;

        last = last.previous;

        return temp;
    }

    public void print() {
        System.out.println("Zawartosc listy:");
        ListElem current = first;

        while (current!=null) {
            System.out.print(current.Data + " ");
            current = current.next;
        }
    }

    public boolean find(int elem)     // Wyszukiwanie elementu
    {
        if (isEmpty()) return false;

        ListElem current = first;  // Rozpoczynamy od pierwszego elementu
        while (current.Data != elem)
        {
            if (current.next == null) return false;
            else
                current = current.next;
        }
        return true;
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        int p1 = 12;
        list.insertFirst(p1);
        list.insertFirst(13);
        list.insertFirst(14);
        list.insertLast(2);
        list.insertLast(7);
        list.insertLast(5);

        list.print();

        list.removeFirst();

        list.print();

        System.out.println("\n"+list.find(133333));
    }
}
