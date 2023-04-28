public class Trapez extends FiguraPlaska{
    private float a, b, h,r1,r2, pole, obwod;
    public Trapez(float a, float b, float r1, float r2, float h){
        this.a = a;
        this.b = b;
        this.r2 = r2;
        this.r1 = r1;
        this.h = h;
    }
    public void obliczObwod(){
        obwod = a+b+r1+r2;
    }
    public void obliczPole(){
        pole = ((a+b)/2)*h;
    }
    public void wyswietlInformacje(){
        System.out.println("TRAPEZ");
        System.out.println("Wymiary: Podstawy: \nA)"+a+"\nB)" + b + "ramina" + r1 + " i " + r2);
        System.out.println("Pole: " + pole);
        System.out.println("Obwód: " + obwod);
    }

}
