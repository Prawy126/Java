public class Kolo {
    private double promien;
    private double obwod;
    private double pole;

    public Kolo(double promien){
        this.promien=promien;
    }
    public double Obwod(){
        this.obwod=this.promien*2*(Math.PI);
        return this.obwod;
    }
    public double Pole(){
        this.pole = this.promien*this.promien*Math.PI;
        return this.pole;
    }
    public void pokaz(){
        System.out.println("Pole koła: " + this.Pole());
        System.out.println("Obwód koła: " + this.Obwod());
    }
}
