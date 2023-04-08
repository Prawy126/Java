public class Main2 {
    public static void main(String[] args){
        Punkt2D punkt2D = new Punkt2D();
        System.out.println(punkt2D.toString());
        punkt2D.losowanie();
        System.out.println(punkt2D.toString());
        Punkt2D punkt2D1 = new Punkt2D(12,21);
        System.out.println(punkt2D1.toString());
        Punkt3D punkt3D = new Punkt3D();
        System.out.println(punkt3D.toString());
    }
}
