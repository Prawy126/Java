public class Main {
    public static void main(String[] args) {
            System.out.println(wyswietl());
            System.out.println(dodaj());
            System.out.println(dodaj(5));
            System.out.println(dodaj(5,4));
    }
    static String wyswietl() {

        return "Hello world";
    }
    static int dodaj(){

        return 0;
    }
    static int dodaj(int x){

        return ++x;
    }
    static int dodaj(int x, int y){

        return x+y;
    }
}