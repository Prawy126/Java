import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        Queue<String> kolejka = new ArrayDeque<>();

        kolejka.add("Pierwszy");
        kolejka.add("Drugi");
        kolejka.add("Trzeci");


        System.out.println(kolejka.size());
        System.out.println(kolejka.peek());
        System.out.println(kolejka.remove());
        System.out.println(kolejka.poll());
        System.out.println(kolejka.remove());
        System.out.println(kolejka.size());

        System.out.println();
        System.out.println();

        Stack<String> stos = new Stack<>();
        stos.push("Pierwszy");
        stos.push("Drugi");
        stos.push("Trzeci");
        System.out.println(stos.size());
        System.out.println(stos.pop());
        stos.push("Ostatni");
        System.out.println(stos.pop());
        System.out.println(stos.pop());
        System.out.println(stos.pop());


    }
}