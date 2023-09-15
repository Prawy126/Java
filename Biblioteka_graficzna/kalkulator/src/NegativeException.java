public class NegativeException extends Exception{
    public NegativeException(){

    }
    @Override
    public String getMessage(){
        return "Podana liczba jest ujemna";
    }
}
