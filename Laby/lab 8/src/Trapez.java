public class Trapez extends FiguraPlaska{
    private float a, b, h,r1,r2, pole, obwod;
    public Trapez(float a, float b, float r1, float r2, float h){
        if(a>0)this.a = a;
        else this.a = 0;
        if(b>0)this.b = b;
        else this.b = 0;
        if(r2>0)this.r2 = r2;
        else this.r2 = 0;
        if(r1>0)this.r1 = r1;
        else this.r1 = 0;
        if(h>0)this.h = h;
        else this.h = 0;
    }
    public void obliczObwod(){
        obwod = a+b+r1+r2;
    }
    public void obliczPole(){
        pole = ((a+b)/2)*h;
    }
    public String toString(){
        return super.toString() + "\nTRAPEZ\nWymiary: \nPodstawy: \nA)"+a+"\nB)" + b + "\nramina" + r1 + " i " + r2 + "\nPole: " + pole + "\nObwód: " + obwod;
    }

}
