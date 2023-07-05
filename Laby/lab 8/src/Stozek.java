public class Stozek extends FiguraPrzestrzenna{
    private double r, h, l, pole, objetosc;
    public Stozek(float r, float h, float l){
        if(r>0) this.r = r;
        else this.r = 0;
        if(h>0) this.h = h;
        else this.h = 0;
        if(l>0) this.l = l;
        else this.l = 0;
    }
    public void obliczPole(){
        pole = Math.PI*r*(r+l);
    }
    public void obliczObjetosc(){
        objetosc = (1/3)*Math.PI*Math.pow(r,2)*h;
    }
    public String toString(){
        return super.toString() + "STOŻEK\nWymiary: r=" + r + " h=" + h + " l=" + l + "\nPole: " + pole + "\nObjętość: " + objetosc;
    }
}
