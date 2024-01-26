package A.A2_BDB;

// A2 Implementacja uporzatkowanej tablicy dynamicznej "OrdDynArray" - BDB

public class OrdDynArray {
    public Person[] tab;
    public int size;
    OrdDynArray(int size)
    {
        tab = new Person[size];
        this.size = 0;
    }
    public void add(Person p)
    {
        if(size >= tab.length)
        {
            Person[] temp = new Person[tab.length * 2];
            for (int i = 0; i < size; i++) temp[i] = tab[i];
            tab = temp;
        }
        int i;
        for(i = 0; i < size; i++)
        {
            if(tab[i].compareTo(p) > 0) break;
        }
        for(int j = size; j > i; j--)
        {
            tab[j] = tab[j - 1];
        }
        tab[i] = p;
        size++;
    }
    public Person get(int index)
    {
        if(index >= size || index < 0) return null;
        return tab[index];
    }
    public int size(){return size;}
    public boolean remove(int index)
    {
        if(index >= size || index < 0) return false;
        for(int i = index; i < size - 1; i++)
        {
            tab[i] = tab[i + 1];
        }
        size--;
        return true;
    }
    public int find(Person p)
    {
        for(int i = 0; i< size; i++)
        {
            if(tab[i].getImie().equals(p.getImie())
            && tab[i].getNazwisko().equals(p.getNazwisko())
            && tab[i].getWiek() == p.getWiek()) return i;
        }
        return -1;
    }
    public int find2(Person p)
    {
        for(int i = 0; i < size; i++) if(tab[i].compareTo(p) == 0 )return i;
        return -1;
    }
    public void print()
    {
        for(int i = 0; i < size; i++)
        {
            System.out.println(tab[i]);
        }
    }

    public static void main(String[] args) {
        OrdDynArray sortowana = new OrdDynArray(1);
        Person p1 = new Person("Kamil", "Nowak", 33);
        sortowana.add(p1);
        sortowana.add(new Person("Krystian", "Kuras", 22));
        sortowana.add(new Person("Mariusz", "Berkowicz", 31));
        sortowana.add(new Person("Wiktoria", "Wojtowicz", 11));
        sortowana.add(new Person("Julia", "Lisek", 23));
        sortowana.add(new Person("Kamila", "Kowal", 33));
        sortowana.print();

        System.out.println(sortowana.find(p1));
    }
}
