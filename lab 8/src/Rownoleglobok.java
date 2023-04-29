public class Rownoleglobok extends FiguraPlaska{
    private float a, b, h, pole, obwod;
    public Rownoleglobok(float a, float b, float h){
        if(a>0) this.a = a;
        else this.a = 0;
        if(b>0) this.b = b;
        else this.b = 0;
        if(h>0) this.h = h;
        else this.h = 0;
    }
    public void obliczObwod(){
        obwod = 2*a + 2*b;
    }
    public void obliczPole(){
        pole = a * h;
    }
    public String toString(){
        return "RÓWNOLEGŁOBOK\nBok: " + a + " i "+ b + "\nWysokość: " + h + "\nPole: " + pole + "\nObwód: " + obwod;
    }
}
