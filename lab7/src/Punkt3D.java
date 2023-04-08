import java.util.concurrent.ThreadLocalRandom;

public class Punkt3D extends Punkt2D{
    private int z;
    @Override
    void losowanie(){
        super.losowanie();
        this.z= ThreadLocalRandom.current().nextInt(-10, 10);
    }
    @Override
    public String toString(){
        return super.toString() +" z: "+ this.z;

    }
}
