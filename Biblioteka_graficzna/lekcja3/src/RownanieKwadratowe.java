public class RownanieKwadratowe {
    private int a,b,c;

    public RownanieKwadratowe(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public String rozwiaz(){
        String rozwiazanie = "";
        double delta;
        delta = (b*b-4*a*c);
        if(delta>0){
            delta = Math.sqrt(delta);
            double x1 = (-b-delta)/(2*a);
            double x2 = (-b+delta)/(2*a);
            return "Rówanie posaida dwa pierwaidki " + x1 + " oraz " + x2;
        }else if(delta == 0){
            double x = -b/(2*a);
            return "Równanie posiada jeden pierwiastek " + x;
        }else {
            return "Równanie nie posiada rozwiązań rzeczywistych";
        }
    }
    public void setA(int a){
        this.a = a;
    }
    public void setB(int b){
        this.b=b;
    }
    public void setC(int c){
        this.c=c;
    }
}
