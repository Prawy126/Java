public class Obliczenia {

    public double dodawanie(double a, double b){
        return a+b;
    }
    public double odejmowanie(double a, double b){
        return a-b;
    }
    public double mnozenie(double a, double b){
        return a*b;
    }
    public double dzielenie(double a, double b) throws ArithmeticException{
        if(b==0){
            throw new ArithmeticException();
        }
        return a/b;
    }
    public double pierwiastek(double a){
        return Math.sqrt(a);
    }
    public double sinus(double a){
        return Math.sin(a);
    }
    public double cosinus(double a){
        return Math.cos(a);
    }
    public double tangens(double a) {
        return Math.tan(a);
    }
}
