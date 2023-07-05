//5a
public class NegativeNumberException extends Exception{
    public NegativeNumberException(String message){
        super(message);
        System.out.println(message);
    }
}
