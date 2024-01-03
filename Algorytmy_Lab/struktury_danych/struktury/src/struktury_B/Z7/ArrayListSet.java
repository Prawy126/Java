package struktury_B.Z7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

/*
 Implementacja zbioru za pomocą klasy ArrayList (dst – zbiór liczb całkowitych, db – zbiór wartości opakowanych np. klasami
Double, Float lub obiektów typu String, bdb – zbiór złożonych obiektów zdefiniowanych przez użytkownika, np. zbiór osób
[imię nazwisko, wiek], książek [tytuł, wydawnictwo, rok wydania] itp.).
 Wykonać następujący eksperyment ze strukturą w której bierze udział 5 różnych elementów a, b, c, d, e. Przebieg
eksperymentu: tworzymy zbiory A i B, wstawiamy do A elementy a, b, c, d oraz do B elementy c, d, e; wyliczamy i
wypisujemy zbiory: iloczyn A i B, suma A i B, różnica A\B; usuwamy ze zbioru A element c i ze zbioru B element e;
powtórnie wyliczamy i wypisujemy zbiory: iloczyn A i B, suma A i B, różnica A\B.
 */
//Implementacja zbioru liczb calkowitych za pomoca klasy ArrayList


public class ArrayListSet
{
    private ArrayList<Integer> integerSet;

    public ArrayListSet()    // konstruktor
    {
        integerSet = new ArrayList<Integer>();
    }

    public int size() //Zwraca liczbe elementow w zbiorze
    {
        return integerSet.size();
    }

    public void insert(int elem)    // wstawia element do zbioru
    {
        if (!member(elem))
            integerSet.add(elem);
    }

    private int get(int index) //Pobiera element o podanym numerze z wewnetrznej tablicy dynamicznej
    {
        return integerSet.get(index).intValue();
    }

    public boolean member(int elem)  // sprawdza, czy dany element nalezy do zbioru
    {
        for (int i=0; i<size(); i++)
            if (get(i)==elem)
                return true;
        return false;
    }

    public boolean delete(int elem)  // usuwa element ze zbioru
    {
        int position = -1;
        for (int i=0; i<size(); i++)
        {
            if (get(i)==elem)
            {
                position = i;
                break;
            }
        }

        if (position>-1)
        {
            integerSet.remove(position);
            return true;
        }

        return false;
    }


    public ArrayListSet union(ArrayListSet secondSet) //Oblicza sume zbioru biezacego ze zbiorem z parametru metody
    {
        ArrayListSet unionSet = new ArrayListSet();

        for (int i=0; i<size(); i++)
        {
            int locElem = get(i);
            unionSet.insert(locElem);
        }

        for (int i=0; i<secondSet.size(); i++)
        {
            int locElem = secondSet.get(i);
            unionSet.insert(locElem);
        }

        return unionSet;
    }

    public ArrayListSet intersection(ArrayListSet secondSet) //Oblicza iloczyn zbioru biezacego ze zbiorem z parametru metody
    {
        ArrayListSet intersectionSet = new ArrayListSet();

        for (int i=0; i<size(); i++)
        {
            int locElem = get(i);
            if (secondSet.member(locElem))
                intersectionSet.insert(locElem);
        }

        return intersectionSet;
    }

    public ArrayListSet difference(ArrayListSet secondSet) //Oblicza roznice zbioru biezacego ze zbiorem z parametru metody
    {
        ArrayListSet differenceSet = new ArrayListSet();

        for (int i=0; i<size(); i++)
        {
            int locElem = get(i);
            if (!secondSet.member(locElem))
                differenceSet.insert(locElem);
        }

        return differenceSet;
    }

    public void print()
    {
        for (int i=0; i<size(); i++)
        {
            int locElem = get(i);
            System.out.print(locElem+" ");
        }
        System.out.println();
    }

    //----------------------------------------------------------------

    //Implementacja zapisu i odczytu zbioru do/z pliku

    public void saveToFile(String fileName) throws IOException
    {
        FileOutputStream fos = new FileOutputStream(fileName); //Otwarcie strumienia do pliku tekstowego
        PrintWriter pw = new PrintWriter(fos);

        pw.println(size()); //Zapis rozmiaru zbioru

        for (int i = 0; i < integerSet.size(); i++) //Zapis elementow
            pw.println(get(i));

        pw.close(); //Zamkniecie pliku
    }

    private int getIntFromFile(BufferedReader br) throws IOException //Oczytanie z pliku liczby calkowitej (na poczatku wiersza)
    {
        String line = br.readLine();
        StringTokenizer st = new StringTokenizer(line);
        String stringVal = st.nextToken();
        int intVal = 0;
        try
        {
            intVal = Integer.parseInt(stringVal);
        }
        catch (NumberFormatException e)
        {
            throw new IOException("Format error with integer value! "+e.getMessage());
        }
        return intVal;
    }

    public void loadFromFile(String fileName)
            throws IOException
    {
        File inFile = new File(fileName);

        if (!inFile.exists()) //Sprawdzenie czy taki plik istnieje
        {
            throw new IOException("Cannot open file with set: " + fileName);
        }

        integerSet.clear();

        FileReader fr = new FileReader(inFile); //Otwarcie strumienia do pliku
        BufferedReader br = new BufferedReader(fr);

        int s = getIntFromFile(br); //Oczytanie liczby elementow zbioru

        for (int i=0; i<s; i++) //Odczytanie elementow zbioru
        {
            int elem = getIntFromFile(br); //Odczytanie pojedynczego elementu, czyli liczby calkowitej
            integerSet.add(elem); //Dodanie elementu do zbioru
        }

        br.close();
    }



    //-----------------------------------------

    public static void main(String[] args)
    {
        ArrayListSet theSetA = new ArrayListSet();  // tworzymy nowy zbior A
        theSetA.insert(60);     // dodajemy elementy do zbioru
        theSetA.insert(20);
        theSetA.insert(40);

        theSetA.print();

        boolean test20 = theSetA.member(20);
        System.out.println("Wynik testu w zbiorze A dla 20: "+test20);

        theSetA.print();

        boolean test30 = theSetA.member(30);
        System.out.println("Wynik w zbiorze A pierwszego testu dla 30: "+test30);

        theSetA.insert(30);

        theSetA.print();

        test30 = theSetA.member(30);
        System.out.println("Wynik w zbiorze A drugiego testu dla 30: "+test30);

        theSetA.delete(30);

        theSetA.print();

        test30 = theSetA.member(30);
        System.out.println("Wynik w zbiorze A trzeciego testu dla 30: "+test30);

        theSetA.insert(10); //Dodanie jeszcze dwoch elementow
        theSetA.insert(90);

        System.out.println("--------------------------------------------");

        System.out.println("Zbior A:");
        theSetA.print();

        ArrayListSet theSetB = new ArrayListSet();  // tworzymy nowy zbior B
        theSetB.insert(40);     // dodajemy elementy do zbioru
        theSetB.insert(70);
        theSetB.insert(60);
        theSetB.insert(80);

        System.out.println("Zbior B:");
        theSetB.print();


        ArrayListSet unionSet = theSetA.union(theSetB); //Obliczenie sumy zbiorow
        System.out.println("Suma A i B:");
        unionSet.print();

        ArrayListSet intersectionSet = theSetA.intersection(theSetB); //Obliczenie iloczynu zbiorow
        System.out.println("Iloczyn A i B:");
        intersectionSet.print();

        ArrayListSet differenceSet = theSetA.difference(theSetB); //Obliczenie roznicy zbiorow
        System.out.println("Roznica A-B:");
        differenceSet.print();

        //Demonstracja zapisu i doczytu zbioru
        System.out.println("--------------------------------------------------");

        try
        {
            System.out.println("Zbior przed zapisem:");
            unionSet.print();
            unionSet.saveToFile("src/suma.txt");
            ArrayListSet theSetSUM = new ArrayListSet();
            theSetSUM.loadFromFile("src/suma.txt");
            System.out.println("Zbior po odczycie:");
            theSetSUM.print();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
