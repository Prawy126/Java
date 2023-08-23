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
    public double sinus(double a, boolean stopnie){
        double pomoc, wynik;
        if(stopnie){
           pomoc = (a*Math.PI)/180;
           return Math.sin(pomoc);
        }else {
            return Math.sin(a);
        }
    }
    public double cosinus(double a, boolean stopnie){
        double pomoc, wynik;
        if(stopnie){
            pomoc = (a*Math.PI)/180;
            return Math.cos(pomoc);
        }else {
            return Math.cos(a);
        }
    }
    public double tangens(double a, boolean stopnie) {
        double pomoc, wynik;
        if(stopnie){
            pomoc = (a*Math.PI)/180;
            return Math.tan(pomoc);
        }else {
            return Math.tan(a);
        }
    }
    public double cotangens(double a, boolean stopnie){
        double pomoc, wynik;
        if(stopnie){
            pomoc = (a*Math.PI)/180;
            return 1/Math.tan(pomoc);
        }else {
            return 1/Math.tan(a);
        }
    }
    public double wartoscBezwzgledna(double a){
        return Math.abs(a);
    }
    public String dziesietnyNaDwojkowy(int a) {
        System.out.println("Przed"+a);
        StringBuilder wynik = new StringBuilder();
        while (a > 0) {
            int reszta = a % 2;
            wynik.insert(0, reszta);
            a = a / 2;
            System.out.println("W trakcie" + a);
        }
        System.out.println(wynik.toString());
        return wynik.toString();
    }


}
