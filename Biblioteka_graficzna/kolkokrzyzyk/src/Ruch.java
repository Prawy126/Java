public class Ruch {
    private int x, y;
    private char znak;
    public Ruch(int x, int y, char znak){
        if(znak == 'X'||znak=='O'){
            this.znak = znak;
        }else {
            System.out.println("Błąd nie poprawny znak");
        }
        if((x<3) && (x>=0)){
            this.x = x;
        }else System.out.println("Błąd wartość przekracza tablicę");

        if((y<3) && (y>=0)){
            this.y = y;
        }else System.out.println("Błąd wartość przekracza tablicę");

    }
    public int getX(){
        return this.x;
    }
    public int getY(){
        return this.y;
    }
    public char getZnak(){
        return this.znak;
    }
}
