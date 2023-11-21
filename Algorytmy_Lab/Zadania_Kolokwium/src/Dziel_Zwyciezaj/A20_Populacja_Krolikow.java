package Dziel_Zwyciezaj;
class A20_Populacja_Krolikow {

        static boolean przekroczonaSto, przekroczonaTysiac, przekroczonaDziesięćTysięcy, przekroczonyMilion;

        public static int zliczajKroliki(int n) {
            if (n == 1 || n == 2) return 1;

            int ilośćKrolików = zliczajKroliki(n - 1) + zliczajKroliki(n - 2);
            //jeśli w zadaniu trzeba zliczać czas po ilu populacja przekroczy i wypisać na ekran
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

            return ilośćKrolików;
        }

        public static void main(String[] args) {
            final int N = 40;
            System.out.println("Obliczanie liczby krolików w ciągu Fibonacciego dla n = " + N);
            int ilośćKrolików = zliczajKroliki(N);
            System.out.println("Liczba krolików w ciągu Fibonacciego dla n = " + N + " wynosi: " + ilośćKrolików);
        }
    }
