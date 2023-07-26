public class Animal implements Comparable<Animal> {
    public Animal(String name){
        this.name = name;
    }
    String name;
    int wiek = 5;

    @Override

    public int compareTo(Animal o) {
        System.out.println(this.name.compareTo(o.name));
        if(this.name.compareTo(o.name)!= 0){
            return this.name.compareTo(o.name);
        }
          return this.wiek - o.wiek;
    }
}
