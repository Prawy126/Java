public class Zadanie1 {
    public static void main(String[] args){
        for(int i = 10; i>=0;i--){
            if(i==1 || i == 3 || i == 6 || i == 8){
                continue;
            }
            System.out.println(i);
        }
    }
}
