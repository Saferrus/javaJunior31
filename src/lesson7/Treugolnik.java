package lesson7;

public class Treugolnik {

    private int a;
    private int b;
    private int c;

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setC(int c) {
        this.c = c;
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

        System.out.printf("���� �����: %.2f ������� \n���� ����: %.2f ������� \n���� �����: %.2f �������\n", uglAlpha, uglBeta, uglGamma);
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
            System.out.println("�������������");
        } else if (a != b && b != c && a != c) {
            System.out.println("��������������");
        } else {
            System.out.println("��������������");

        }
    }

    public void information() {
        System.out.println("          ���������� � ������������");

        System.out.println("");

        System.out.println("������� ������������: ");
        System.out.printf("������� �: %d\n������� b: %d\n������� �: %d\n", this.a, this.b, this.c);
        System.out.println("");

        System.out.print("��� ������������: ");
        tipTreugolnika();
        System.out.println("");


        System.out.printf("�������� ������������: %d\n", perimetr());
        System.out.println("");

        System.out.printf("������� ������������: %.2f\n", ploshad());
        System.out.println("");

        System.out.printf("������ ������������: %.2f\n", visota());
        System.out.println("");

        System.out.println("�������� ����� ������������: ");
        ugl();


    }


}
