public class Kula extends FiguraPrzestrzenna{
    private double r,objetosc,pole;
    public Kula(double r){
        if(r>0) this.r = r;
        else this.r = 0;
    }
    public void obliczPole(){
        pole=4*Math.PI*Math.pow(r,2);
    }
    public void obliczObjetosc(){
        objetosc = 4*(Math.PI*Math.pow(r,3))/3;
    }
    public String toString(){
        return super.toString() + "\nKULA\nR: " + r + "\nPole: " + pole + "\nObjętość: " + objetosc;
    }
}
