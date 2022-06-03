package lesson2;

public class Main2 {
    public static void main(String[] args) {
        int a = 3;
        int b = 3;
        int c = 3;

        //
        if (a == b && b == c && c == a) {
            System.out.println("Это равностороний треугольник");
        } else if (a != b && b != c && a != c) {
            System.out.println("Это разносторонний треугольник");
        } else {
            System.out.println("Это равнобедренный треугольник");

        }
    }
}
