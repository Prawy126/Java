//zadanmie 4
public class Main5 {
    public static void main(String[] args){
        Osoba osoba = new Osoba();
        try{
            osoba.setWaga(1);
            osoba.setWiek(10);
            osoba.setNazwisko("Nowak");
            osoba.setImie("Jacek");
            osoba.setWzrost(1.9f);
        }catch(NegativeNumberException e){
            System.out.println("Podano nie dodatnią wartość wagi");
        }catch(NullPointerException e){
            System.out.println("Wartość nie została podana");
        }
        System.out.println(osoba.getWaga());
    }
}
