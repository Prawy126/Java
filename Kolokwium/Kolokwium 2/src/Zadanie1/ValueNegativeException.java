package Zadanie1;

import java.io.IOException;

public class ValueNegativeException extends Exception {
    private int wartosc;
    public ValueNegativeException(int wartosc){
        this.wartosc=wartosc;
    }
    @Override
    public String toString(){
        return "Wartosc "+wartosc+" jest ujemna";
    }


}
