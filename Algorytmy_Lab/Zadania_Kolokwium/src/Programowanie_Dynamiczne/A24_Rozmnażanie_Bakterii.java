package Programowanie_Dynamiczne;

public class A24_Rozmnażanie_Bakterii {
    public static void main(String[] args) {
        final int maksymalnaLiczbaBakterii = 1000000;
        int liczbaIteracji = (int) Math.ceil((Math.log(maksymalnaLiczbaBakterii) / Math.log(2)) + 1);
        int[] populacjaBakterii = new int[liczbaIteracji];

        boolean osiagnietyProgTysiac = false;
        boolean osiagnietyProgDziesiecTysiecy = false;
        boolean osiagnietyProgStoTysiecy = false;
        boolean osiagnietyProgMilion = false;

        for (int i = 0; i < liczbaIteracji; i++) {
            if (i == 0) {
                populacjaBakterii[i] = 1;
            } else {
                populacjaBakterii[i] = 2 * populacjaBakterii[i - 1];
            }

            if (!osiagnietyProgTysiac && populacjaBakterii[i] > 1000) {
                System.out.println("Tysiąc razy: po " + (i * 2) + " minutach");
                osiagnietyProgTysiac = true;
            }

            if (!osiagnietyProgDziesiecTysiecy && populacjaBakterii[i] > 10000) {
                System.out.println("Dziesięć tysięcy razy: po " + (i * 2) + " minutach");
                osiagnietyProgDziesiecTysiecy = true;
            }

            if (!osiagnietyProgStoTysiecy && populacjaBakterii[i] > 100000) {
                System.out.println("Sto tysięcy razy: po " + (i * 2) + " minutach");
                osiagnietyProgStoTysiecy = true;
            }

            if (!osiagnietyProgMilion && populacjaBakterii[i] > maksymalnaLiczbaBakterii) {
                System.out.println("Milion razy: po " + (i * 2) + " minutach");
                osiagnietyProgMilion = true;
            }
        }
    }
}
