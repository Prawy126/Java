public class Main {
    public static void main(String[] args) {

        Samochod audi = new Samochod();
        audi.iloscKol=4;
        audi.marka="Audi";
        System.out.println(audi.marka + " " + audi.iloscKol);
        audi.odpal();

        audi.zmaknijOtworz();
        audi.zmaknijOtworz();

        audi.toString();
        SamochodSportowy subaru = new SamochodSportowy();
        subaru.zmaknijOtworz();
        subaru.odpal();

        Motocykl suzuki = new Motocykl();
        System.out.println(suzuki.iloscKol);
    }
}