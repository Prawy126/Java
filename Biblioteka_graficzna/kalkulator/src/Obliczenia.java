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

    /*public double potegowanie(int a, int b)throws NegativeException{
        if(b<0){
            throw new NegativeException();
        }
        double wynik = 1;
        for(int i = 0; i<b;i++){
            wynik = wynik*a;
        }
        return wynik;
    }*/

    public String innySystem(int a, int podstawa) {
        StringBuilder liczbaKoncowa = new StringBuilder();

        if (a < podstawa) {
            return String.valueOf(a);
        }

        while (a >= podstawa) {
            int reszta = a % podstawa;
            if (reszta < 10) {
                liczbaKoncowa.insert(0, reszta); // Dodaj resztę na początek
            } else {
                // Jeśli reszta >= 10, użyj liter A-F dla szesnastkowego
                char cyfraHex = (char) ('A' + (reszta - 10));
                liczbaKoncowa.insert(0, cyfraHex); // Dodaj literę na początek
            }
            a = a / podstawa;
        }

        // Dodaj ostatnią cyfrę (lub literę) na początek wyniku
        if (a < 10) {
            liczbaKoncowa.insert(0, a);
        } else {
            char cyfraHex = (char) ('A' + (a - 10));
            liczbaKoncowa.insert(0, cyfraHex);
        }

        return liczbaKoncowa.toString();
    }

    public double hyper(double a, String funkcja){
        if(funkcja.equals("sinus")){
            return Math.sinh(a);
        }else if(funkcja.equals("cosinus")){
            return Math.cosh(a);
        }else if(funkcja.equals("tangens")){
            return Math.tanh(a);
        }else{
            return Math.cosh(a)/Math.sinh(a);
        }
    }

}


