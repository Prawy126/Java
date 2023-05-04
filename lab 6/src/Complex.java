//zadanie 3
public class Complex {
    public static double ObliczModulLiczbyZespolonej(double x, double y){
        return Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
    }
    public static void ObliczLiczbeSprzezona(double x, double y){
        System.out.println(x + " + " + (-1)*y+"i");
    }
    public static void AlgebraicznaNaWykladnicza(double x, double y){
        double z = ObliczModulLiczbyZespolonej(x,y);
        double fi = Math.atan(x/y);
        System.out.println(z + " + " + fi + "i");
    }
    public static void WykladniczaNaAlgebraiczna(double x, double y){
        double z = Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
        double fi = Math.atan(y/x);
        x = z * Math.cos(fi);
        y = z * Math.sin(fi);
        System.out.println(x + " + " + y + "i");
    }
    public static void Dodawanie(double x1 , double x2, double y1, double y2){
        x1 = x1 + x2;
        y1 = y1 + y2;
        System.out.println(x1 + " + " + y1 + "i");
    }
    public static void Odejmowanie(double x1, double x2, double y1, double y2){
        x1 = x1 - x2;
        y1 = y1 - y2;
        System.out.println(x1 + " + " + y1 + "i");
    }

    public static String Mnozenie(double x1, double x2, double y1, double y2){
        return x1*x2 + y1*y2 + " " + x1*y2 + x2*y1 + "i";
    }
    public static String Algebariczny(double x, double y){
        return x + " + " + y + "i";
    }
    public static String Trygonometryczna(double r, double fi){
        return r + "cos(" + fi + ") + sin(" + fi + ")";
    }
}
