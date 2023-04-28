public class Prostokat extends FiguraPlaska{
    private float a,b,pole,obwod;
    public Prostokat(float a, float b){
        if(a>0) this.a = a;
        else this.a = 0;
        if(b>0) this.b = b;
        else this.b = 0;
    }
    public void obliczPole(){
        this.pole = a * b;
    }
    public void obliczObwod(){
        obwod = 2*a+2*b;
    }
    public void wyswietlInformacje(){
        System.out.println("PROSTOKĄT");
        System.out.println("Boki: " + this.a + ", " + this.b);
        System.out.println("Obwod: " + this.obwod);
        System.out.println("Pole: " + this.pole);
    }
}
