public class Test {
    public static void main(String[] args){
        Obliczenia obliczenia = new Obliczenia();
        try{
            System.out.println(obliczenia.potegowanie(-23,0));
        }catch(NegativeException e){
            System.out.println(e.getMessage());
        }

    }
}
