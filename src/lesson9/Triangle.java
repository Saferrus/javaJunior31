package lesson9;

public class Triangle {

    private int a;
    private int b;
    private int c;

    public Triangle() {
    }

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;

        if (this.a > this.b + this.c) {
            System.out.println("Одна из сторон треугольника больше суммы двух других, такого треугольника не может существовать!");
        }
        if (this.b > this.a + this.c) {
            System.out.println("Одна из сторон треугольника больше суммы двух других, такого треугольника не может существовать!");
        }
        if (this.c > this.a + this.b) {
            System.out.println("Одна из сторон треугольника больше суммы двух других, такого треугольника не может существовать!");
        }
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Triangle triangle = (Triangle) o;

        if (a != triangle.a) return false;
        if (b != triangle.b) return false;
        return c == triangle.c;
    }

    @Override
    public int hashCode() {
        int result = a;
        result = 31 * result + b;
        result = 31 * result + c;
        return result;
    }

    @Override
    public String toString() {
        return "Стороны треугольника {" +
                "a = " + a +
                ", b = " + b +
                ", c = " + c +
                '}';
    }

    public int perimetr() {
        return this.a + this.b + this.c;
    }


    public double ploshad() {
        double a = (double) this.a;
        double b = (double) this.b;
        double c = (double) this.c;

        double p = (a + b + c) / 2;
        double ploshad = Math.sqrt(p * (p - this.a) * (p - this.b) * (p - this.c));

        return ploshad;
    }

    public void ugl() {
        double a = (double) this.a;
        double b = (double) this.b;
        double c = (double) this.c;

        double uglAlpha = Math.toDegrees(Math.acos((a * a + c * c - b * b) / (2 * a * c)));
        double uglBeta = Math.toDegrees(Math.acos((a * a + b * b - c * c) / (2 * a * b)));
        double uglGamma = Math.toDegrees(Math.acos((b * b + c * c - a * a) / (2 * c * b)));

        System.out.printf("Угол альфа: %.2f градуса \nУгол бета: %.2f градуса \nУгол гамма: %.2f градуса\n", uglAlpha, uglBeta, uglGamma);
    }

    public double visota() {
        double a = (double) this.a;
        double b = (double) this.b;
        double c = (double) this.c;

        double p = (a + b + c) / 2;
        double height = (2 / a) * Math.sqrt(p * (p - a) * (p - c) * (p - b));

        return height;

    }

    public void tipTreugolnika() {
        if (a == b && b == c && c == a) {
            System.out.println("равностороний");
        } else if (a != b && b != c && a != c) {
            System.out.println("разносторонний");
        } else {
            System.out.println("равнобедренный");

        }
    }

    public void information() {


        System.out.println("          Информация о треугольнике");

        System.out.println("");

        System.out.println("Стороны треугольника: ");
        System.out.printf("Сторона а: %d\nСторона b: %d\nСторона с: %d\n", this.a, this.b, this.c);
        System.out.println("");

        System.out.print("Тип треугольника: ");
        tipTreugolnika();
        System.out.println("");


        System.out.printf("Периметр треугольника: %d\n", perimetr());
        System.out.println("");

        System.out.printf("Площадь треугольника: %.2f\n", ploshad());
        System.out.println("");

        System.out.printf("Высота треугольника: %.2f\n", visota());
        System.out.println("");

        System.out.println("Величина углов треугольника: ");
        ugl();


    }
}
