public class Main {
    public static void main(String[] args) {

        Animal a1 = new Animal();
        Animal a2 = new Animal();
        a1.name = "Tom";
        a2.name = "Tom";

        System.out.println(a1.equals(a2));

    }
}