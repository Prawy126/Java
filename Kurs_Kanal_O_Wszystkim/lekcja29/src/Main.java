public class Main {
    public static void main(String[] args) {

        Animal cat = new Animal(){
            //metoda anonimowa
            @Override
            void makeVoice() {
                System.out.println("Meoww Meoww!!!");
            }

        };

        cat.makeVoice();
        cat.eat();

        Animal cat2 = new Animal();

        cat2.makeVoice();
        cat2.eat();

        System.out.println("--------------------------------");
        //użycie klasy w klasie
        Animal.Pet pet = cat.new Pet();
        pet.name = "tak";
        System.out.println(pet.name);
    }
}