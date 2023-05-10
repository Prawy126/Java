import java.util.InputMismatchException;
import java.util.Scanner;

//zadanie 2
public class Main2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String[] tab = {"Micahł","Paweł","Ania","Dawid","Marcin","Julia","Emilia","Marcel","Miłosz","Maksymilian","Oliwia"};
        int index = 0;
        while(index!=-1){
            try {
                System.out.println("Proszę podać numer indexu");
                index = scanner.nextInt();
                System.out.println(tab[index]);
            }catch (InputMismatchException e){
                System.out.println("Nie poprawna wartość indexu: ");
                scanner.nextLine();
                index = -1;
            }catch(IndexOutOfBoundsException e){
                System.out.println("Index tablicy został przekroczony");
            }
        }
    }
}
