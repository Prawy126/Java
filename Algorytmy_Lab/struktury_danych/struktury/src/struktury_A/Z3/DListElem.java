package struktury_A.Z3;

public class DListElem
{
    public int iData;              // Dana w elemencie listy (liczba calkowita)
    public DListElem next;          // Referencja do następnego elementu listy
    public DListElem previous;      /// Referencja do poprzedniego elementu listy

    public DListElem(int iData) // konstruktor
    {
        this.iData = iData;   // Inicjalizacja danych
        next = null;
        previous = null;
    }

    public String toString()
    {
        return Integer.toString(iData);
    }
}
