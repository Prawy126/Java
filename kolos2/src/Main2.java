public class Main2 {
    public static void main(String[] args){
        Liczby liczby = new Liczby(3);
        liczby.uzupelnij();
        liczby.wyswietl();
        System.out.println("Suma: " + liczby.suma());
    }

}
