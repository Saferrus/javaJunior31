package lesson9;

public class Rectangle extends Square {
    private int b;

    public Rectangle() {
    }

    public Rectangle(int a, int b) {
        super(a);
        this.b = b;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Rectangle rectangle = (Rectangle) o;

        return b == rectangle.b;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + b;
        return result;
    }

    @Override
    public String toString() {
        return "Стороны прямоугольника {" + " a = " + getA() + "," +
                " b = " + b +
                '}';
    }

    @Override
    public int perimetr() {
        return (getA()+this.b)*2;
    }

    @Override
    public int ploshad() {
        return getA()*this.b;
    }
}
