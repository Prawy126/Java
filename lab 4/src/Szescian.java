
public class Szescian {
    private float a,pole,obwod,objetosc;
    public Szescian(float a){
        this.a = a;
    }
    public float pole(){
        this.pole =(this.a)*(this.a)*6;
        return this.pole;
    }
    public float obwod(){
        this.obwod = 12*(this.a);
        return this.obwod;
    }
    public float objetosc(){
        this.objetosc = (this.a)*(this.a)*(this.a);
        return this.objetosc;
    }

    public void wypisz(){
        System.out.println("Obwód szescianu: " + this.obwod());
        System.out.println("Pole szescianu: " + this.pole());
        System.out.println("Objetość szescianu: " + this.objetosc());

    }

}
