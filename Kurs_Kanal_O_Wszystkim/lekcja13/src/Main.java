public class Main {
    public static void main(String[] args) {

        float a = 7.9f;
        int c = 0;
        short b = (short)a;
        String liczba = Integer.toString(b) + "abc";
        try {
            c = Integer.parseInt(liczba);

            System.out.println(c);
        }
        catch(Exception ex){
            System.out.println(ex.toString());
        }

    }
}