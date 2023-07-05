public class Main2 {
    public static void main(String[] args){
        Punkt2D punkt2D = new Punkt2D();
        System.out.println(punkt2D.toString());
        punkt2D.losowanie();
        System.out.println(punkt2D.toString());
        Punkt2D punkt2D1 = new Punkt2D(12,21);
        System.out.println(punkt2D1.toString());
        Punkt3D punkt3D = new Punkt3D();
        punkt3D.losowanie();
        System.out.println(punkt3D.toString());

        //tablice
        Punkt2D[] array2D = new Punkt2D[100];
        Punkt3D[] array3D = new Punkt3D[100];
        for(int i = 0;i<100;i++){
            array3D[i] = new Punkt3D();
            array2D[i] = new Punkt2D();
            array3D[i].losowanie();
            array2D[i].losowanie();
        }
        int licz = 1;

        //sprawdzanie
       for(int i = 0; i<100;i++){
            for(int j = 0; j<100; j++){
                if(((array2D[i].x)==(array3D[j].x))&&((array2D[i].y)==(array3D[j].y))) {
                    System.out.println("Para nr " + licz + ":");
                    System.out.println(array3D[j].toString());
                    System.out.println(array2D[i].toString());
                    licz++;
                }
            }
        }

    }
}
