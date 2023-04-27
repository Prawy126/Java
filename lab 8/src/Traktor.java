public class Traktor extends Produkt{
    public Traktor(String name, double price, String describe){
        super(name,price,describe);
    }
    public void buy(){
        System.out.println("I bougth a black tractor, capaciticy 2400!");
    }
    public void showInfo(){
        System.out.println("Price: " + getPrice() + "PLN name: " + getName() + " describe: " + getDescribe());
    }
}
