public class Romb extends FiguraPlaska{
    private float a,b,f,d,pole,obwod;
    public Romb(float a,float b,float f, float d){
        if(a>0) this.a = a;
        else this.a = 0;
        if(b>0) this.b = b;
        else this.b = 0;
        if(f>0) this.f = f;
        else this.f = 0;
        if(d>0) this.d = d;
        else this.d = 0;
    }
    public void obliczObwod(){
        obwod = 2*a + 2*b;
    }
    public void obliczPole(){
        pole = (d*f)/2;
    }
    public String toString(){
        return "ROMB\nBoki i przekątne: " + a + " " + b + " i " + f+ " " + d + "\nPole: " + pole + "\nObwód: " + obwod;
    }
}
