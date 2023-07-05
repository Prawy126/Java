package Zadanie1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int a;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Proszę podać wartość: ");
        a=scanner.nextInt();
        try{

            wypiszDodatnia(a);
        }catch (ValueNegativeException e){
            System.out.println(e.toString());

        }
        System.out.println("Podana wartość to: " + a);
    }
    public static void wypiszDodatnia(int a)throws ValueNegativeException{
        if(a<0){
            throw new ValueNegativeException(a);
        }
    }
}
