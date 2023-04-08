public class Main1 {
    public static void main(String[] args){
        Osoba osoba = new Osoba("Patryk", "Nowak", "M",12,12,2000);
        osoba.wyswietl();
        System.out.println("-----------------------------------------");
        Student student = new Student("Anna","Kowalska","K",9,10,1999,123414,2010,"Stacjonarne","Fizjoterapia");
        student.wyswietl();
        System.out.println("---------------------");
        Wykladowca wykladowca = new Wykladowca("Paweł","Kowal","M",1,2,1980,"Programowanie Obiektowe","Uniwersytet",40,20);
        wykladowca.wyswietl();
    }
}
