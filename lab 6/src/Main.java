//zadanie 1
public class Main {
    public static void main(String[] args) {

        System.out.println("Obwód koła o r = 0,5 : " + Figura.ObwodKola(0.5));
        System.out.println("Pole koła o r = 0,5 : " + Figura.PoleKola(0.5));
        System.out.println("Obwód kwadratu o a = 0,5 : " + Figura.ObwodKwadratu(0.5));
        System.out.println("Pole kwadratu o a = 0,5 : " + Figura.PoleKwadratu(0.5));
        System.out.println("Obwód prostokąta o a = 0,5 i b = 3 : " + Figura.ObwodProstokata(0.5, 3));
        System.out.println("Pole prostokąta o a = 0,5 i b = 3 : " + Figura.PoleProstokata(0.5 , 3));
        System.out.println("Pole powierzchni całkowitej stożka o l = 0,5 i r = 2 : " + Figura.PolePowierzchniStozka(0.5 , 2));
        System.out.println("Objętość stożka  o r = 0,5 i h = 5 : " + Figura.ObjetoscStozka(0.5 , 5));
        System.out.println("Pole walca o r = 0,5 h = 7 : " + Figura.PolePowierzchniWalca(0.5,7));
        System.out.println("Objętość walca o r = 0,5 h = 7 : " + Figura.ObjetoscWalca(0.5,7));

    }
}