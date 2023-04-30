public class Szescian extends FiguraPrzestrzenna{
    private double a, polePowierzchni, objetosc;
    public Szescian(double a){
        if(a>0) this.a = a;
        else this.a = 0;

    }
    public void obliczObjetosc(){

        objetosc = Math.pow(a,3);
    }
    public void obliczPole(){
        polePowierzchni = 6*(a*a);
    }
    public String toString(){
        return super.toString() + ":\nSZEŚCIAN\nBok: " + a +"\nPole powierzchni: " + polePowierzchni + "\nObjętość: " + objetosc;
    }
}
