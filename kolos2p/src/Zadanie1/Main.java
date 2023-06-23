package Zadanie1;

import java.util.Scanner;



public class Main{
    public static void main(String[] args) {
        try{
            podajWartosc();
        }catch (ValueNegativeException e){
            e.toString();
        }
    }

    public static void  podajWartosc()throws ValueNegativeException {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        if(i<0){
            throw new ValueNegativeException();
        }
    }
}
