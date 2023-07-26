public class Main {
    public static void main(String[] args) {

        int[] y={5};

        zmein(y);

        System.out.println("y = "+y[0]);

    }
    public static void zmein(int[] x){
        x = new int[1];
        x[0]+=20;
        System.out.println("x = "+x[0]);

    }
}