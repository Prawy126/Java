//zadanie 3
public class DynamicArrayInt<T> {
    private T[] table;
    private int nElems;

    public DynamicArrayInt(int maxSize) {
        table = (T[]) new Object[maxSize];
        nElems = 0;
    }

    public void add(T value) {
        if (nElems >= table.length) {
            T[] locTable = (T[]) new Object[table.length * 2];
            System.arraycopy(table, 0, locTable, 0, table.length);
            table = locTable;
        }
        table[nElems] = value;
        nElems++;
    }

    public T get(int index) {
        return table[index];
    }

    public int size() {
        return nElems;
    }

    public boolean remove(int index) {
        if (nElems == 0) {
            return false;
        }
        for (int j = index; j < nElems - 1; j++) {
            table[j] = table[j + 1];
        }
        nElems--;
        return true;
    }

    public int find(T searchElem) {
        for (int j = 0; j < nElems; j++) {
            if (table[j].equals(searchElem))
                return j;
        }
        return -1;
    }

    public void print() {
        for (int i = 0; i < nElems; i++) {
            System.out.println(get(i) + " ");
        }
        System.out.println();
    }
}
