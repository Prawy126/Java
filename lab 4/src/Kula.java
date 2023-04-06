public class Kula {
    private double r, d, v, a;
    public Kula(double r){
        this.r = r;
    }
    public double objetosc(){
        this.v =(4/3)*(this.r)*(this.r)*(this.r)*Math.PI;
        return this.v;
    }
    public double pole(){
        this.a = 4*(Math.PI)*(this.r)*(this.r);
        return this.a;
    }
    public double srednica(){
        this.d = (this.r)*2;
        return this.d;
    }
    public void wypisz(){
        System.out.println("Średnica wynosi: " + (this.srednica()));
        System.out.println("Pole wynosi: " + (this.pole()));
        System.out.println("Objetosc wynosi: " + (this.objetosc()));
    }
}
