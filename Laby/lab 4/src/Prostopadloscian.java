public class Prostopadloscian {
    float a,b,h,objetosc,pole,obwod;
    public Prostopadloscian(float a,float b,float h){
        this.a = a;
        this.b = b;
        this.h = h;

    }
    public float objetosc(){
        this.objetosc = (this.a)*(this.b)*(this.h);
        return this.objetosc;
    }
    public float pole(){
        this.pole = 2*(this.a)*(this.b)+2*(this.a)*(this.h)+2*(this.h)*(this.b);
        return this.pole;
    }
    public float obwod(){
        this.obwod = 4*(this.a)+4*(this.b)+4*(this.h);
        return this.obwod;
    }
    public void wypisz(){
        System.out.println("Obwód prostopadłoscianu: " + this.obwod());
        System.out.println("Pole prostopadłoscianu: " + this.pole());
        System.out.println("Objętość prostopadłoscianu: " + this.obwod());
    }
}
