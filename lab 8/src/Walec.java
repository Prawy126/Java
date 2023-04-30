public class Walec extends FiguraPrzestrzenna{
    private double r, h, pole, objetosc;
    public Walec(double r, double h){
        if(h>0) this.h = h;
        else this.h = 0;
        if(r>0) this.r = r;
        else this.r = 0;
    }
    public void obliczObjetosc(){
        objetosc = Math.PI*Math.pow(r,2)*h;
    }
    public void obliczPole(){
        pole = 2*Math.PI*h + 2*Math.PI*Math.pow(r,2);
    }
    public String toString(){
        return super.toString() + "\nWALEC\nWymiary: r=" + r +" h=" + h + "\nPole: " + pole + "\nObjętość: " + objetosc;
    }
}
