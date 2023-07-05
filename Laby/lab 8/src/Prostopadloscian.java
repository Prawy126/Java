public class Prostopadloscian extends FiguraPrzestrzenna{
    private float a, b, c, polePowierzchni, objetosc;
    public Prostopadloscian(float a, float b, float c){
        if(a>0) this.a = a;
        else this.a = 0;
        if(b>0) this.b = b;
        else this.b = 0;
        if(c>0) this.c = c;
        else this.c = 0;
    }
    public void obliczObjetosc(){

        objetosc = a * b * c;
    }
    public void obliczPole(){
        polePowierzchni = 2*a*b+2*a*c+2*c*b;
    }
    public String toString(){
        return super.toString() + "\nPorotopadłościan\nBok: " + a + ", "+b+" i "+ c + "\nPole powierzchni: " + polePowierzchni + "\nObjętość: " + objetosc;
    }
}
