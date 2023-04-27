public class Zakupy extends Produkt{
    public Zakupy(String name,double price,String describe){
        super(name,price,describe);

    }

    @Override
    public void buy() {
        System.out.println("Kupiono " + getName() + " za " + getPrice() + "PLN");
    }

    @Override
    public void showInfo() {
        System.out.println("Nazwa produktu: " + getName() + "\nCena: " + getPrice() + "PLN\nOpis: " + getDescribe());
    }
}
