//zadanie 4
public class DivisionByZeroException extends ArithmeticException {
    public DivisionByZeroException() {
        System.out.println("Wystąpiłwyjątek dzielenia przez zero");

    }

    @Override
    public String getMessage() {
        return "Wywołanie metody spowodowało wyrzucenie wyjątku dzielenia przez zero";
    }
    //4b
    public void DivisionD(double dzielna, double dzielnik) {
        if (dzielna == 0) {
            DivisionByZeroException exception = new DivisionByZeroException();
            System.out.println(exception.getMessage());
        }
    }

    public void DivisionF(float dzielna, float dzielnik) {
        if (dzielna == 0) {
            DivisionByZeroException exception = new DivisionByZeroException();
            System.out.println(exception.getMessage());
        }
    }
}

