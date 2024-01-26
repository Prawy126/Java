package A.A1_BDB;

public class Point {
    private double x, y;
    private String nazwa;

    public Point(double x, double y, String nazwa) {
        this.x = x;
        this.y = y;
        this.nazwa = nazwa;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}' + " nazwa: " + nazwa;
    }
}
