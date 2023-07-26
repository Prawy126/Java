public class Obliczenia implements Runnable{

    @Override
    public void run() {
        for(int i = 0; i<=100; i++){
            System.out.println(i + ". ID: " + Thread.currentThread().getId());
        }
    }
}
