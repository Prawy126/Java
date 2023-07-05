public class Main {
    public static void main(String[] args) {

        for(int i = 200; i>=0;i--){
            if(i%2==0){
                System.out.println(i);
            }else{
                continue;
            }
        }
    }
}