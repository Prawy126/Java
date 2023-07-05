abstract public class  Produkt {
    private double price;
    private String name, describe;
    Produkt(String name,double price, String describe){
        this.price = price;
        this.describe = describe;
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public String getDescribe(){
        return this.describe;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public abstract void buy();
    public abstract void showInfo();
}

