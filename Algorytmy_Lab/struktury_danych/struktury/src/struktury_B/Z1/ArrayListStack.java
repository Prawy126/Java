
package struktury_B.Z1;

import java.util.ArrayList;

/*
 Implementacja stosu za pomocą klasy ArrayList (dst – stos liczb całkowitych, db – stos wartości opakowanych np. klasami
Double, Float lub obiektów typu String, bdb – stos złożonych obiektów zdefiniowanych przez użytkownika, np. tablica osób
[imię nazwisko, wiek], książek [tytuł, wydawnictwo, rok wydania] itp.).
 Wykonać następujący eksperyment ze strukturą w której bierze udział 5 różnych elementów A, B, C, D, E. Przebieg
eksperymentu: tworzymy strukturę, wstawiamy do struktury A, B, C; usuwamy dwa elementy; wstawiamy D i E; usuwamy
wszystkie elementy wypisując je na ekran.
 */
//Implementacja stosu liczb calkowitych za pomoca tablicy dynamicznej ArrayList przez OSADZANIE


public class ArrayListStack
{
    private ArrayList<Integer> intStack;

    public ArrayListStack()    // konstruktor
    {
        intStack = new ArrayList<Integer>();
    }

    public void push(int elem)    // odkłada element na szczyt stosu
    {
        intStack.add(elem);
    }

    public int pop() // pobiera element ze szczytu stosu
    {
        int topElem = intStack.get(intStack.size()-1); //Pobiera ostatni element tablicy dynamicznej
        intStack.remove(intStack.size()-1); //usuwa ostatni element
        return topElem; //Zwraca ostatni element
    }

    public int peek()  // podgląda wartość na szczycie stosu
    {
        return intStack.get(intStack.size()-1); //Zwraca ostatni element
    }

    public boolean isEmpty()    // zwraca true, jeżeli stos pusty
    {
        return intStack.isEmpty();
    }

    public static void main(String[] args)
    {
        ArrayListStack theStack = new ArrayListStack();  // tworzymy nowy stos o rozmiarze 10 (z relokacja)
        theStack.push(20);     // odkładamy elementy na stosie
        theStack.push(40);
        theStack.push(60);
        theStack.push(80);
        theStack.push(81);

        while (!theStack.isEmpty())     // dopóki stos nie jest pusty...
        {                             // ...pobieramy z niego elementy
            int value = theStack.pop();
            System.out.println(value+" ");      // wypisanie elementu
        }
        System.out.println("");
    }
}
