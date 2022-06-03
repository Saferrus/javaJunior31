package lesson3;

import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {

        //консольное приложение по просчету площади и периметра разнаых фигур

        System.out.println("Выберите фигуру:");
        System.out.println("1 - Квадрат");
        System.out.println("2 - Прямоугольник");
        System.out.println("3 - Треугольник");
        System.out.println("4 - Трапеция");
        System.out.println("5 - Овал");

        Scanner scanner = new Scanner(System.in);
        String figura = scanner.nextLine();


        if (figura.equals("1") || figura.equalsIgnoreCase("квадрат")) {
            System.out.println("Введите сторону квадрата: ");

            String storona = scanner.nextLine();

            int a = Integer.parseInt(storona);

            System.out.println("Периметр квадрата: " + (a * 4));
            System.out.println("Площадь квадрата: " + (a * a));

        }
        if (figura.equals("2") || figura.equalsIgnoreCase("прямоугольник")) {
            System.out.println("Введите одну мз сторон прямоугольника: ");

            String storonaA = scanner.nextLine();
            int a = Integer.parseInt(storonaA);

            System.out.println("Введите вторую сторону прямоугольник: ");

            String storonaB = scanner.nextLine();
            int b = Integer.parseInt(storonaB);

            System.out.println("Периметр прямоугольника: " + (a + b) * 2);
            System.out.println("Площадь прямоугольника: " + a * b);
        }
        if (figura.equals("3") || figura.equalsIgnoreCase("треугольник")) {


            System.out.println("Введите одну из сторон треугольника: ");
            String storonaA = scanner.nextLine();
            double a = Integer.parseInt(storonaA);

            System.out.println("Введите вторую сторону треугольника: ");
            String storonaB = scanner.nextLine();
            double b = Integer.parseInt(storonaB);

            System.out.println("Введите третью сторону треугольника: ");
            String storonaC = scanner.nextLine();
            double c = Integer.parseInt(storonaC);

            double p = (a + b + c) / 2;
            double S = Math.sqrt(p * (p - a) * (p - b) * (p - c));


            if (Double.isNaN(S)) {
                System.out.println("Одна сторона треугольника больше суммы двух других сторон. Такой треугольник не может существовать.");
            } else {
                System.out.println("Периметр треугольника: " + (a + b + c));
                System.out.println("Площадь треугольника: " + S);
            }
        }
        if (figura.equals("4") || figura.equalsIgnoreCase("трапеция")) {


            System.out.println("Введите одно из оснований трапеции: ");
            String osnovanieA = scanner.nextLine();
            double a = Integer.parseInt(osnovanieA);

            System.out.println("Введите второе основание трапеции: ");
            String osnovanieB = scanner.nextLine();
            double b = Integer.parseInt(osnovanieB);

            System.out.println("Введите одну из сторон трапеции: ");
            String storonaC = scanner.nextLine();
            double c = Integer.parseInt(storonaC);

            System.out.println("Введите сторону трапеции: ");
            String storonaD = scanner.nextLine();
            double d = Integer.parseInt(storonaD);

            double S = ((a + b) / 2) * Math.sqrt(c * c - ((((b - a) * (b - a) + c * c - d * d) / (2 * (b - a))) * (((b - a) * (b - a) + c * c - d * d) / (2 * (b - a)))));

            if (Double.isNaN(S)) {
                System.out.println("Трапеции с заданными велечинами не может существовать");
            } else {
                System.out.println("Периметр трапеции: " + (a + b + c + d));
                System.out.println("Площадь трапеции: " + S);
            }
        }
        if (figura.equals("5") || figura.equalsIgnoreCase("овал")) {

            double pi = 3.14;

            System.out.println("Введите одну из осей овала: ");
            String osA = scanner.nextLine();
            double a = Integer.parseInt(osA);

            System.out.println("Введите вторую ось овала: ");
            String osB = scanner.nextLine();
            double b = Integer.parseInt(osB);

            double S = a / 2 * b / 2 * pi;
            double P = 2 * pi * Math.sqrt((a * a + b * b) / 8);

            System.out.println("Периметр овала: " + P);
            System.out.println("Площадь овала: " + S);

        }
    }
}