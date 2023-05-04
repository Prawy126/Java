//zadanie 1
public class Figura {
    static{
        System.out.println("Biblioteka obliczająca wielkości figur geometrycznych!!!");
    }
    public static double PoleKola(double r){
        return Math.PI*Math.pow(r,2);
    }
    public static double ObwodKola(double r){
        return 2*Math.PI*r;
    }
    public static double ObwodKwadratu(double a){
        return 4*a;
    }
    public static double PoleKwadratu(double a){
        return Math.pow(a,2);
    }
    public static double ObwodProstokata(double a, double b){
        return 2*a+2*b;
    }
    public static double PoleProstokata(double a, double b){
        return a*b;
    }
    public static double PolePowierzchniStozka(double l, double r){
        return Math.PI*Math.pow(r,2) + Math.PI * r * l;
    }
    public static double ObjetoscStozka(double r, double h){
        return (Math.pow(r,2)*Math.PI*h)/3;
    }
    public static double PolePowierzchniWalca(double r, double h){
        return 2*(Math.PI*Math.pow(r,2))+2*(Math.PI*r*h);
    }
    public static double ObjetoscWalca(double r, double h){
        return Math.PI*Math.pow(r,2)*h;
    }
}
