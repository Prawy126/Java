//zadanie -2
public class Book extends Product {
    private int pagesNum;
    public Book(double price, int pagnesNum){
        this.setPrice(price);
        this.pagesNum = pagnesNum;
    }
    public int getPagesNum(){
        return pagesNum;
    }

}
