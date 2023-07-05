public class Prostokat {
    private float a,b,pole,obwod;

    public Prostokat(float a, float b){
        this.a = a;
        this.b = b;
    }
    public float pole(){
        this.pole = (this.a)*(this.b);
        return this.pole;
    }
    public float obwod(){
        this.obwod = 2*(this.a)+2*(this.b);
        return this.obwod;
    }
    public void pokaz(){
        System.out.println("Obwód prostokąta: " + this.obwod());
        System.out.println("Pole prostokąta: " + this.pole());
    }

}
