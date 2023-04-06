public class Kwadrat {
    private float a;
    private float pole, obwod;
    public Kwadrat(float a){
        this.a = a;
    }
    public float pole(){
        this.pole=this.a*this.a;
        return this.pole;
    }
    public float obwod(){
        this.obwod = 4*(this.a);
        return this.obwod;
    }

    public void wyswietl(){
        System.out.println("Pole kwadratu: " + this.pole());
        System.out.println("Obwód kwadratu: " + this.obwod());

    }
}
