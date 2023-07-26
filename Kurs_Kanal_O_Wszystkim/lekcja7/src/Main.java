public class Main {
    public static void main(String[] args) {
        int i = 5;
        System.out.println("Pętla while: ");
        while(i > 0)
        {
            System.out.println(i);
            i--;
        }
        System.out.println("Pętla do whiel:");
        i = 5;
        do{
            System.out.println(i);
            i--;
        }while(i>0);


        System.out.println("Pętla for:");
        for(int j=5;j>0;j--)
        {
            System.out.println(j);
        }
    }
    //pętle działają tak samo jak w c
}