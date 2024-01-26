package A.A3_BDB;

public class ListElem {
    public int Data;
    public ListElem next, previous;

    public ListElem(int n) {
        Data = n;
        next = null;
        previous = null;
    }
}
