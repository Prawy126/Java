import java.util.concurrent.ThreadLocalRandom;

public class Punkt2D {
    public int x,y;
    Punkt2D(){
        this.x = 0;
        this.y = 0;
    }
    Punkt2D(int x, int y){
        this.x = x;
        this.y = y;
    }
    void losowanie(){
        this.x= ThreadLocalRandom.current().nextInt(-10, 10);
        this.y= ThreadLocalRandom.current().nextInt(-10, 10);
    }
    @Override
    public String toString(){
        return "x: " + this.x + " y: " + this.y;
    }
}
