public class Kolo extends FiguraPlaska{
    private double r,pole,obwod;
    public Kolo(double r){
        if(r>0) this.r = r;
        else this.r = r;
    }
    public void obliczPole(){
        pole = Math.PI*Math.pow(r,2);
    }
    public void obliczObwod(){
        obwod = 2*Math.PI*r;
    }
    public String toString(){

        return super.toString()+"\nKOŁO\nPromień: " + r + "\nObówd: " + obwod + "\nPole: " + pole;
    }
}
