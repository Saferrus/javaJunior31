package lesson6;

public class UtilsHomeWork6_1 {


    public static void triangleAreaGeron(double a, double b, double c) {
        double p = (a + b + c) / 2;
        double s = Math.sqrt(p * (p - a) * (p - b) * (p - c));

        if (Double.isNaN(s)) {
            System.out.println("");
            System.out.println("���� ������� ������������ ������ ����� ���� ������ ������. ����� ����������� �� ����� ������������.");
        } else {
            System.out.println("");
            System.out.printf("������� ������������: %,1.2f �2\n", s);

        }
    }


    public static int smallestNumber(int a, int b, int c, int d) {
        int smallNumber = 0;
        if (a < b && a < c && a < d) {
            smallNumber = a;
        }
        if (b < a && b < c && b < d) {
            smallNumber = b;
        }
        if (c < a && c < b && c < d) {
            smallNumber = c;

        }
        if (d < a && d < b && d < c) {
            smallNumber = d;
        }
        return smallNumber;
    }

    public static void uppercaseText(String text) {
        text = text.toUpperCase();
        System.out.println(text);
    }

    public static void triangleType(int a, int b, int c) {
        if (a == b && b == c && c == a) {
            System.out.println("��� ������������� �����������");
        } else if (a != b && b != c && a != c) {
            System.out.println("��� �������������� �����������");
        } else {
            System.out.println("��� �������������� �����������");

        }
    }
}
