public class Kwadrat extends FiguraPlaska{
    private float a,obwod;
    private double pole;
    public Kwadrat(int a){
        if(a>0) this.a = a;
    }
    public void obliczObwod(){
        this.obwod = 4*this.a;
    }
    public void obliczPole(){
        this.pole = Math.pow(this.a,2);
    }
    public void wyswietlInformacje(){
        System.out.println("KWADRAT\nPole: " + this.pole + "\nObwód: " + this.obwod + "\nBok: " + this.a);
    }
}
