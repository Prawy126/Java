public class Main {
    public static void main(String[] args) {

        int a = 25;
        int b = 10;
        int wynik;
        System.out.println("Działania na liczbach " + a + " i " + b);
        wynik = a + b;
        System.out.println("Dodawanie: " + wynik);
        wynik = a - b;
        System.out.println("Odaejmowanie: " + wynik);
        wynik = a / b;
        System.out.println("Dzeilenie całkowite: " + wynik);
        wynik = a * b;
        System.out.println("Mnoznie: " + wynik);

        double wynik2 = (double)a/b;
        System.out.println("Dzielenie: " + wynik2);

        wynik = a%b;
        System.out.println("Reszta z dzielenia: " + wynik);

        wynik = 2 + 2 * 2;
        System.out.println("Wynik 2+2*2 wynosi " + wynik);

        //skróty
        a+=b;
        a-=b;
        a*=b;
        a/=b;
        a%=b;

        Math.pow(2,3);
        System.out.println("2^3 = " + Math.pow(2,3));

        Math.sqrt(9);
        System.out.println("pierwiastek z 9: " + Math.sqrt(9));

        Math.abs(-50);
        System.out.println("Wartość bezwględna liczby -50: " + Math.abs(-50));

        //libcza pi i e
        System.out.println("Liczba PI: " + Math.PI + " i wartość liczby e: " + Math.E);


    }
}