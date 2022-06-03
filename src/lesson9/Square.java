package lesson9;

public class Square {
    private int a;

    public Square() {
    }

    public Square(int a) {
        this.a = a;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Square square = (Square) o;

        return a == square.a;
    }

    @Override
    public int hashCode() {
        return a;
    }

    @Override
    public String toString() {
        return "Сторона квадрата {" +
                " a= " + a +
                '}';
    }

    public int perimetr() {
        return this.a * 4;
    }

    public int ploshad() {
        return this.a * this.a;
    }
}
