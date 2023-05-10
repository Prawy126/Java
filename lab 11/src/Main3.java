//zadanie 3
public class Main3 {
    public static void main(String[] args){
        //a)
        double x = 2.0/0/0.0;
        System.out.println(x);

        //b)
        float y = 2.0f/0.0f;
        System.out.println(y);

        //c)
        try {
            int z = 2 / 0;
            System.out.println(z);
        }catch (ArithmeticException e){
            System.out.println("DZIELENIE PRZEZ 0 NIE JEST MOŻLIWE!!!");
        }
    }
}
