public class Main {
    public static void main(String[] args) {

        Cat kot = new Cat();
        kot.dajGlos();
        kot.idz();
        Animal pies = new Dog();
        pies.dajGlos();
        ((Dog)pies).idz();
        //Animal chomik = new Animal(); - błąd
    }
}