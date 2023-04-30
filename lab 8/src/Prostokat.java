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
    public String toString(){
        return super.toString() + "\nPROSTOKĄT\nBoki: " + this.a + ", " + this.b + "\nObwod: " + this.obwod + "\nPole: " + this.pole;
    }
}
