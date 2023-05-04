//zadanie 1
public class Main {
    public static void main(String[] args) {
        Para para1 = new Para(1,2);
        Para para2 = new Para(2.2, 3);
        Para para3 = new Para("tak",2);
        Para para4 = new Para("tak", "nie");
        System.out.println(para1.getPierwszy() + " i " + para1.getDrugi());
        System.out.println(para2.getPierwszy() + " i " + para2.getDrugi());
        System.out.println(para3.getPierwszy() + " i " + para3.getDrugi());
        System.out.println(para4.getPierwszy() + " i " + para4.getDrugi());
    }
}