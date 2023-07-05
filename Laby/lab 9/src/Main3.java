//zadanie 3
public class Main3 {
    public static void main(String[] args){
        DynamicArrayInt in = new DynamicArrayInt(5);
        in.add("tak");
        in.add(2);
        in.add(null);
        in.add(false);
        in.add(2.3);
        in.print();
    }
}
