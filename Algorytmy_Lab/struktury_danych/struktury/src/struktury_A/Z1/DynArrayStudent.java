package struktury_A.Z1;

/*Treść zadania
 Implementacja tablicy dynamicznej (dst – tablica liczb całkowitych, db – tablica wartości opakowanych np. klasami Integer,
Double, Float lub obiektów typu String, bdb – tablica złożonych obiektów zdefiniowanych przez użytkownika, np. tablica osób
[imię nazwisko, wiek], książek [tytuł, wydawnictwo, rok wydania] itp.) */
// Implementacja tablicy dynamicznej zlozonych obiektow (studentow) zdefiniowanych przez uzytkownika
// Pamiętaj o klasie Student

public class DynArrayStudent
{
    private Student [] table;  //Referencja do tablicy
    private int nElems;  //Aktualna liczba elementow w tablicy

    public DynArrayStudent(int maxSize)  // Konstruktor
    {
        table = new Student[maxSize]; // Tworzymy tablice
        nElems = 0;               // Na razie brak elementow w tablicy
    }

    public void add(Student value)    	// Wstawienie elementu do tablicy
    {
        if (nElems >= table.length)
        {
            Student [] locTable = new Student[table.length*2];
            for (int i=0; i<table.length; i++) locTable[i]=table[i];
            table = locTable;
        }

        table[nElems] = value;       	// Wstawiamy element
        nElems++;                      	// Zwiekszamy licznik elementow
    }

    public Student get(int index) // Pozyskanie elementu o danym indeksie
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

    public int find(Student searchElem) // Szukanie okreslonego elementu
    {
        for (int j = 0; j < nElems; j++)
        {
            if (table[j].equals(searchElem)) return j; //Element znaleziono
        }
        return -1; // Elementu nie znaleziono
    }

    public int find2(Student searchElem) // Szukanie okreslonego elementu (porownywanie wartosci pol)
    {
        for (int j = 0; j < nElems; j++)
        {
            if (table[j].getImie().equals(searchElem.getImie())
                    && table[j].getNazwisko().equals(searchElem.getNazwisko())
                    && table[j].getAlbum() == (searchElem.getAlbum())
            )
                return j; //Element znaleziono
        }
        return -1; // Elementu nie znaleziono
    }

    public void print()
    {
        for (int i = 0; i < nElems; i++)
            System.out.print(get(i).toString()+"\n");
        System.out.println();
    }
    public void print2()
    {
        for (int i = 0; i < nElems; i++)
            System.out.print(get(i).getImie()+" "+get(i).getNazwisko()+" "+get(i).getAlbum());
        System.out.println();
    }

    public static void main(String[] args)
    {
        int maxSize = 1;
        DynArrayStudent array = new DynArrayStudent(maxSize);

        Student s1;
        s1 = new Student("Ola", "Nowak", 12345);
        array.add(s1);

        Student s2= new Student("Ola2", "Nowak2", 123456);
        array.add(s2);

        Student s3 = new Student();
        s3.setImie("Ala");
        s3.setNazwisko("AAAA");
        s3.setAlbum(6543);
        array.add(s3);

        array.add(new Student("Olek", "Tolek", 6789754));

        array.print();


        System.out.println(array.find(s3));
        System.out.println(array.find(s2));
        System.out.println(array.find(new Student("Ola2", "Nowak2", 123456)));
        Student s5 = s2;
        System.out.println(array.find(s5));

        System.out.println("------------- FIND 2 -------------------");
        System.out.println(array.find2(s3));
        System.out.println(array.find2(s2));
        System.out.println(array.find2(new Student("Ola2", "Nowak2", 123456)));
        Student s6 = s2;
        System.out.println(array.find2(s6));


    }
}







