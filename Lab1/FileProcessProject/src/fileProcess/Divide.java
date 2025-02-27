package fileProcess;

public class Divide {

    private double x, y;
    //private String str;

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

    @Override
    public String toString() {
        return "Divide[" + "x=" + x + ", y=" + y + ']';
    }

    //Concrete methods
    public double calDiv() {
        return (x/y);
    }

    public double calAdd(){
        return (x+y);
    }

    public double calSub(){
        return (x-y);
    }

    public double calMul(){
        return (x*y);
    }

    //Constructor methods
    public Divide(){
        this.x = 0;
        this.y = 0;
    }

    public Divide(double x, double y) {
        this.x = x;
        this.y = y;
    }

}
