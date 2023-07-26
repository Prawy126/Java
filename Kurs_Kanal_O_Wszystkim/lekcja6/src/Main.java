public class Main {
    public static void main(String[] args) {

        int poraRoku = 4;
//switch identyczny jak w c
        switch(poraRoku){

            case 1:
                System.out.println("Wiosna");
                break;
            case 2:
                System.out.println("Lato");
                break;
            case 3:
                System.out.println("Jesień");
                break;
            case 4:
                System.out.println("Zima");
                break;
                default :
                    System.out.println("Skończyły się pory roku");
                    break;
        }


    }
}