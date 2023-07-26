public class Main {
    public static void main(String[] args) {

        Animal kot = new Kot();
        kot.dajGlos();
        System.out.println();

        /*Animal pies = new Pies("Animal");
        pies.dajGlos();
        ((Pies)pies).idz();
        //instaceof
        System.out.println(pies instanceof Kot);
        if(pies instanceof Kot){
            //((Kot)pies).idz;
        }
        if(pies instanceof Pies){
            ((Pies)pies).idz();
        }
        System.out.println(pies instanceof Object);//zazwyczaj daje true
        System.out.println(pies instanceof Animal);

        System.out.println("Coś później");

        //try
        System.out.println("-----------------------------");
        System.out.println("TRY");
        try{
            ((Kot)pies).idz();
        }catch(ClassCastException e){
            System.out.println(e.getMessage());
            //można wstawiać kolejne instrukcje
        }finally {
            System.out.println("Wykonuje się i tak");
        }
        */
        try{
            Animal pies = new Pies("");
            ((Pies)pies).idz();
            int a = 5/0;
        }catch(ClassCastException e){
            System.out.println(e.getMessage());
            //można wstawiać kolejne instrukcje
        }catch (AbstractMethodError e){
            System.out.println(e.getMessage());
        }catch (Exception e){
            System.out.println("Inny błąd");
            System.out.println(e.getMessage());
        }finally {
            System.out.println("Wykonuje się i tak");
        }

    }
}