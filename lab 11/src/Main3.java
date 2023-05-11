//zadnaie 3
public class Main3 {
    public static void main(String[] args) {
        // a)
        try {
            double x = 2.0 / 0.0;
            System.out.println(x);
        } catch (ArithmeticException e) {
            throw new DivisionByZeroException();
        }

        // b)
        try {
            float y = 2.0f / 0.0f;
            System.out.println(y);
        } catch (ArithmeticException e) {
            throw new DivisionByZeroException();
        }

        // c)
        try {
            int z = 2 / 1;
            System.out.println(z);
        } catch (ArithmeticException e) {
            throw new DivisionByZeroException();

        }
        //zadanie 4b)
        try{
            DivisionByZeroException exception = new DivisionByZeroException();
            double dzielna = 0,dzielnik = 0;
            exception.DivisionD(dzielna,dzielnik);

        }catch(DivisionByZeroException e){
           throw new DivisionByZeroException();

        }
        //4c
        try{
            DivisionByZeroException exception = new DivisionByZeroException();
            float dzielna = 0f,dzielnik = 0f;
            exception.DivisionF(dzielna,dzielnik);

        }catch(DivisionByZeroException e){
           throw new DivisionByZeroException();

        }
    }

}
