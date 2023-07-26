public class Pies extends Animal{
    Pies(String imie)throws Zleimie{
        if(imie.length()==0){
            throw new Zleimie();
        }
        this.imie = imie;
    }
    String imie;
    @Override
    public void dajGlos(){
        System.out.println("Hau hau!!!");
    }
    public void idz(){
        System.out.println("Idę sobie");
    }

}
