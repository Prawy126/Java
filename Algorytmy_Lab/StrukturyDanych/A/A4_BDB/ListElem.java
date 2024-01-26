package A.A4_BDB;

public class ListElem {
    public int Data;
    public ListElem previous, next;

    public ListElem( int n) {
        previous = null;
        next = null;
        Data = n;
    }
}
