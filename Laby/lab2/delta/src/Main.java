public class Main {
    public static void main(String[] args) {
        int a=10, b=1, c=1;
        double x1,x2;

        double delta;

        delta=((b*b)-4*a*c);
        System.out.println("Delta: "+delta);
        if(delta>0)
        {
            x1=(b-1*Math.sqrt(delta))/(2*a);
            x2=(b+Math.sqrt(delta))/(2*a);
            System.out.println(x1+" "+x2);
        }else if(delta==0)
        {
            x1=-b/(2*a);
            System.out.println(x1);
        }
        else if(delta<0)
        {
            System.out.println("Odpoiwedź wykracza poza zbiór liczb rzeczywistych");
        }


    }
}