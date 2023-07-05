import java.util.Scanner;
public class main {
    public static void main(String[] args){
        Student student1 = new Student("Adam","Kowalski","Medycyna",123412,2022);
        student1.Pokaz();
        System.out.println();
        Student student2 = new Student("Wojtek","Nowak");
        student2.ustawRok(2015);
        student2.ustawNumerIndexu(123123);
        student2.ustawSpecjazlizacje("Informatyka");
        student2.Pokaz();
        System.out.println();
        Student student3 = new Student("Michał",2022);
        student3.ustawNazwisko("Kowal");
        student3.ustawSpecjazlizacje("Psychologia");
        student3.ustawNumerIndexu(213123);
        student3.Pokaz();
        System.out.println();
        Student student4 = new Student(2012,123123);
        student4.ustawImie("Anna");
        student4.ustawNazwisko("Wesołowska");
        student4.ustawSpecjazlizacje("Prawo");
        student4.Pokaz();

        Student student5 = new Student(2021,2131);
        Scanner w = new Scanner(System.in);
        System.out.print("Podaj imię: ");
        String imie = w.next();
        student5.ustawImie(imie);
        System.out.print("Podaj nazwisko: ");
        String nazwisko = w.next();
        student5.ustawNazwisko(nazwisko);
        System.out.print("Podaj specjalizację: ");
        String specjalnosc = w.next();
        student5.ustawSpecjazlizacje(specjalnosc);
        System.out.println();
        student5.Pokaz();
    }
}
