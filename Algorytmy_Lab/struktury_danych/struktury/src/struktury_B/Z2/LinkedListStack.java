package struktury_B.Z2;

import java.util.LinkedList;

/*
Implementacja stosu za pomocą klasy LinkedList (dst – stos liczb całkowitych, db – stos wartości opakowanych np. klasami
Double, Float lub obiektów typu String, bdb – stos złożonych obiektów zdefiniowanych przez użytkownika, np. tablica osób
[imię nazwisko, wiek], książek [tytuł, wydawnictwo, rok wydania] itp.).
 Wykonać następujący eksperyment ze strukturą w której bierze udział 5 różnych elementów A, B, C, D, E. Przebieg
eksperymentu: tworzymy strukturę, wstawiamy do struktury A, B, C; usuwamy dwa elementy; wstawiamy D i E; usuwamy
wszystkie elementy wypisując je na ekran.
*/
//Implementacja stosu liczb calkowitych za pomoca listy powiazanej LinkedList przez OSADZANIE


public class LinkedListStack
{
    private LinkedList<Integer> intStack;

    public LinkedListStack()    // konstruktor
    {
        intStack = new LinkedList<Integer>();
    }

    public void push(int elem)    // odkłada element na szczyt stosu
    {
        intStack.push(elem);
    }

    public int pop() // pobiera element ze szczytu stosu
    {
        return intStack.pop();
    }

    public int peek()  // podgląda wartość na szczycie stosu
    {
        return intStack.peek();
    }

    public boolean isEmpty()    // zwraca true, jeżeli stos pusty
    {
        return intStack.isEmpty();
    }

    public static void main(String[] args)
    {
        LinkedListStack theStack = new LinkedListStack();
        theStack.push(20);     // odkładamy elementy na stosie
        theStack.push(40);
        theStack.push(60);
        theStack.push(80);

        while (!theStack.isEmpty())     // dopóki stos nie jest pusty...
        {                             // ...pobieramy z niego elementy
            long value = theStack.pop();
            System.out.print(value+"\n");      // wypisanie elementu
        }
        System.out.println("");
    }
}
