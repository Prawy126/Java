class Kroliki {

    static boolean przekroczonaSto, przekroczonaTysiac, przekroczonaDziesięćTysięcy, przekroczonyMilion;

    public static int zliczajKroliki(int n) {
        if (n == 1 || n == 2) return 1;
        int ilośćKrolików = zliczajKroliki(n - 1) + zliczajKroliki(n - 2);

        if (ilośćKrolików > 100 && !przekroczonaSto) {
            System.out.println("Przekroczono sto: " + n);
            przekroczonaSto = true;
        }

        if (ilośćKrolików > 1000 && !przekroczonaTysiac) {
            System.out.println("Przekroczono tysiąc: " + n);
            przekroczonaTysiac = true;
        }

        if (ilośćKrolików > 10000 && !przekroczonaDziesięćTysięcy) {
            System.out.println("Przekroczono dziesięć tysięcy: " + n);
            przekroczonaDziesięćTysięcy = true;
        }

        if (ilośćKrolików > 1000000 && !przekroczonyMilion) {
            System.out.println("Przekroczono milion: " + n);
            przekroczonyMilion = true;
        }

        return ilośćKrolików;
    }

    public static void main(String[] args) {
        final int N = 40;
        zliczajKroliki(N);
    }
}
