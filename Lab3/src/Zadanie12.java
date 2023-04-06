public class Zadanie12 {
    public static void main(String[] args){
        int x=2,y=4,z=0;

        if(x==y && z==z){
            System.out.println("Liczby są równe sobie");
        }else if(x==z || x==y ||z==y) {
            System.out.println("Niektóre liczby są podobne");
        }
        else{
            System.out.println("Liczby nie są sobie równe");
        }
    }
}
