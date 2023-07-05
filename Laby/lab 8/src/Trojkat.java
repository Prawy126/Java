public class Trojkat extends FiguraPlaska{
    private float a, h,obwod, pole;
    public Trojkat(float a, float h){
        if(a>0)this.a = a;
        else this.a = 0;
        if(h>0)this.h = h;
        else this.h = 0;
    }
    public void obliczPole(){
        this.pole = (a*h)/2;
    }
    public void obliczObwod(){
        this.obwod = 3*a;
    }
    public String toString(){
        return super.toString() + "\nTÓJKĄT RÓWNOBOCZNY\nPodstawa: " + this.a + "\nWysokość: " + this.h + "\nPole: " + this.pole + "\nObwód: " + this.obwod;
    }
}
