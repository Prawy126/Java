package Zadanie2;

import Zadanie1.ValueNegativeException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Sokol sokol = new Sokol("Czarny", "Wędrowny", 10, 12, 29);
            Tygrys tygrys = new Tygrys("Tygrysek", "Indyjski", 2, 30);
            Jelen jelen = new Jelen("Polski", "Jelonek", 12, 120);
            Pirania pirania = new Pirania("Pirania", "Rybka", 3, 19, 1000);
            sokol.Lataj(12, 102);
            sokol.Atakuj();
            sokol.pokazInformacje();
            tygrys.pokazInformacje();
            jelen.Biegnij(12);
            jelen.WyadjGlos();
            jelen.pokazInformacje();
            pirania.pokazInformacje();
            //Pirania pirania1 = wprowadzPiranie();
           // pirania1.pokazInformacje();
            Zwierze[] tab = new Zwierze[10];
            tab[0]=sokol;
            tab[0].PokazInformacje();
        } catch (ValueNegativeException e) {
            System.out.println(e.toString());

        }

    }

    public static Jelen wprowadzJelen() {
        try {
            String gatunek, nazwa;
            int wiek, predkoscBiegu;
            Scanner scanner = new Scanner(System.in);
            System.out.println("Proszę podać gatunek Jelenia: ");
            gatunek = scanner.next();
            System.out.println("Proszę podać nazwę Jelenia: ");
            nazwa = scanner.next();
            System.out.println("Proszę podać wiek Jelenia: ");
            wiek = scanner.nextInt();
            System.out.println("Proszę podać prędkość biegu Jelenia:");
            predkoscBiegu = scanner.nextInt();
            return new Jelen(gatunek,nazwa,wiek,predkoscBiegu);
        } catch (ValueNegativeException e) {
            System.out.println(e.toString());
            return wprowadzJelen();
           }

    }
    public static Pirania wprowadzPiranie(){
        try{
            String gatunek, nazwa;
            int wiek, predkoscPlywania, glebokoscPlywania;
            Scanner scanner = new Scanner(System.in);
            System.out.println("Proszę podać gatunek Piranii: ");
            gatunek = scanner.next();
            System.out.println("Proszę podać nazwę Piranii: ");
            nazwa = scanner.next();
            System.out.println("Proszę podać wiek Piranii: ");
            wiek = scanner.nextInt();
            System.out.println("Proszę podać szybkość pływania Piranii: ");
            predkoscPlywania = scanner.nextInt();
            System.out.println("Proszę podać głębokość pływania Piranii: ");
            glebokoscPlywania = scanner.nextInt();

            return new Pirania(gatunek,nazwa,wiek,predkoscPlywania,glebokoscPlywania);

        }catch(ValueNegativeException e){
            System.out.println(e.toString());
            return wprowadzPiranie();
        }
    }
    public static Sokol wprowadzSokol(){
        try{
            String gatunek, nazwa;
            int wiek, predkoscLatania, wysokoscLatania;
            Scanner scanner = new Scanner(System.in);
            System.out.println("Proszę podać gatunek Sokoła: ");
            gatunek = scanner.next();
            System.out.println("Proszę podać nazwę Sokoła: ");
            nazwa = scanner.next();
            System.out.println("Proszę podać wiek Sokoła: ");
            wiek = scanner.nextInt();
            System.out.println("Proszę podać prędkość lotu Sokoła: ");
            predkoscLatania = scanner.nextInt();
            System.out.println("Proszę podać wysokość lotu Sokoła");
            wysokoscLatania = scanner.nextInt();

            return new Sokol(nazwa,gatunek,wiek,wysokoscLatania,predkoscLatania);
        }catch(ValueNegativeException e){
            System.out.println(e.toString());
            return wprowadzSokol();
        }
    }
    public static Tygrys wprowadzTygrys(){
        try{
            String nazwa, gatunek;
            int wiek, predkoscBiegu;
            Scanner scanner = new Scanner(System.in);
            System.out.println("Proszę podać nazwę Tygrysa: ");
            nazwa = scanner.next();
            System.out.println("Proszę podać gatunek Tygrysa: ");
            gatunek = scanner.next();
            System.out.println("Proszę podać wiek Tygrysa: ");
            wiek = scanner.nextInt();
            System.out.println("Proszę podać prędkość poruszania się Tygrysa: ");
            predkoscBiegu = scanner.nextInt();

            return new Tygrys(nazwa,gatunek,wiek,predkoscBiegu);

        }catch (ValueNegativeException e){
            System.out.println(e.toString());
            return wprowadzTygrys();
        }
    }

}
