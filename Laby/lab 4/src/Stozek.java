public class Stozek{
    private double h, r, l, poleP, poleB, objetosc;
    public Stozek(double r, double h){
        this.r = r;
        this.h = h;
    }
    public double poleP(){
        this.poleP = (Math.PI)*(this.r)*(this.r);
        return this.poleP;
    }
    public double poleB(){
        double l = Math.sqrt(Math.pow((this.r),2)+Math.pow((this.h),2));
        this.poleB =(Math.PI)*(this.r)*l;
        return this.poleB;
    }
    public double objetosc(){
        this.objetosc = ((this.poleP())*(this.h))/3;
        return this.objetosc;
    }

    public void wypisz(){
        System.out.println("Pole podstawy wynosi: " + this.poleP());
        System.out.println("Pole boczne wynosi: " + this.poleB());
        System.out.println("Objętość wynosi: " + this.objetosc());
    }
}
