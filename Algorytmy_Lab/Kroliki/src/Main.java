class Main {

    static boolean przekroczonaSto, przekroczonaTysiac, przekroczonaDziesięćTysięcy, przekroczonyMilion;

    // Metoda rekurencyjna zliczająca ilość krolików w ciągu Fibonacciego
    public static int zliczajKroliki(int n) {
        if (n == 1 || n == 2) return 1; // Warunek kończący rekurencję

        int ilośćKrolików = zliczajKroliki(n - 1) + zliczajKroliki(n - 2);

        // Sprawdzenie, czy ilość krolików przekroczyła określone wartości i wypisanie odpowiednich komunikatów
        if (ilośćKrolików > 100 && !przekroczonaSto) {
            System.out.println("Przekroczono sto: " + n + " (Ilość krolików: " + ilośćKrolików + ")");
            przekroczonaSto = true;
        }

        if (ilośćKrolików > 1000 && !przekroczonaTysiac) {
            System.out.println("Przekroczono tysiąc: " + n + " (Ilość krolików: " + ilośćKrolików + ")");
            przekroczonaTysiac = true;
        }

        if (ilośćKrolików > 10000 && !przekroczonaDziesięćTysięcy) {
            System.out.println("Przekroczono dziesięć tysięcy: " + n + " (Ilość krolików: " + ilośćKrolików + ")");
            przekroczonaDziesięćTysięcy = true;
        }

        if (ilośćKrolików > 1000000 && !przekroczonyMilion) {
            System.out.println("Przekroczono milion: " + n + " (Ilość krolików: " + ilośćKrolików + ")");
            przekroczonyMilion = true;
        }

        return ilośćKrolików; // Zwracanie ilości krolików dla danego n
    }

    public static void main(String[] args) {
        final int N = 40; // Określenie liczby kroków w ciągu Fibonacciego
        System.out.println("Obliczanie liczby krolików w ciągu Fibonacciego dla n = " + N);
        int ilośćKrolików = zliczajKroliki(N); // Rozpoczęcie obliczeń
        System.out.println("Liczba krolików w ciągu Fibonacciego dla n = " + N + " wynosi: " + ilośćKrolików);
    }
}
