package lesson9;

public class Oval extends Krug{
    private int radius2;

    public  Oval(){

    }

    public Oval (int radius1, int radius2){
        super(radius1);
        this.radius2 = radius2;
    }

    public int getRadius2() {
        return radius2;
    }

    public void setRadius2(int radius2) {
        this.radius2 = radius2;
    }
}
