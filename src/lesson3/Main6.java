package lesson3;

import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {

        //���������� ���������� �� �������� ������� � ��������� ������� �����

        System.out.println("�������� ������:");
        System.out.println("1 - �������");
        System.out.println("2 - �������������");
        System.out.println("3 - �����������");
        System.out.println("4 - ��������");
        System.out.println("5 - ����");

        Scanner scanner = new Scanner(System.in);
        String figura = scanner.nextLine();


        if (figura.equals("1") || figura.equalsIgnoreCase("�������")) {
            System.out.println("������� ������� ��������: ");

            String storona = scanner.nextLine();

            int a = Integer.parseInt(storona);

            System.out.println("�������� ��������: " + (a * 4));
            System.out.println("������� ��������: " + (a * a));

        }
        if (figura.equals("2") || figura.equalsIgnoreCase("�������������")) {
            System.out.println("������� ���� �� ������ ��������������: ");

            String storonaA = scanner.nextLine();
            int a = Integer.parseInt(storonaA);

            System.out.println("������� ������ ������� �������������: ");

            String storonaB = scanner.nextLine();
            int b = Integer.parseInt(storonaB);

            System.out.println("�������� ��������������: " + (a + b) * 2);
            System.out.println("������� ��������������: " + a * b);
        }
        if (figura.equals("3") || figura.equalsIgnoreCase("�����������")) {


            System.out.println("������� ���� �� ������ ������������: ");
            String storonaA = scanner.nextLine();
            double a = Integer.parseInt(storonaA);

            System.out.println("������� ������ ������� ������������: ");
            String storonaB = scanner.nextLine();
            double b = Integer.parseInt(storonaB);

            System.out.println("������� ������ ������� ������������: ");
            String storonaC = scanner.nextLine();
            double c = Integer.parseInt(storonaC);

            double p = (a + b + c) / 2;
            double S = Math.sqrt(p * (p - a) * (p - b) * (p - c));


            if (Double.isNaN(S)) {
                System.out.println("���� ������� ������������ ������ ����� ���� ������ ������. ����� ����������� �� ����� ������������.");
            } else {
                System.out.println("�������� ������������: " + (a + b + c));
                System.out.println("������� ������������: " + S);
            }
        }
        if (figura.equals("4") || figura.equalsIgnoreCase("��������")) {


            System.out.println("������� ���� �� ��������� ��������: ");
            String osnovanieA = scanner.nextLine();
            double a = Integer.parseInt(osnovanieA);

            System.out.println("������� ������ ��������� ��������: ");
            String osnovanieB = scanner.nextLine();
            double b = Integer.parseInt(osnovanieB);

            System.out.println("������� ���� �� ������ ��������: ");
            String storonaC = scanner.nextLine();
            double c = Integer.parseInt(storonaC);

            System.out.println("������� ������� ��������: ");
            String storonaD = scanner.nextLine();
            double d = Integer.parseInt(storonaD);

            double S = ((a + b) / 2) * Math.sqrt(c * c - ((((b - a) * (b - a) + c * c - d * d) / (2 * (b - a))) * (((b - a) * (b - a) + c * c - d * d) / (2 * (b - a)))));

            if (Double.isNaN(S)) {
                System.out.println("�������� � ��������� ���������� �� ����� ������������");
            } else {
                System.out.println("�������� ��������: " + (a + b + c + d));
                System.out.println("������� ��������: " + S);
            }
        }
        if (figura.equals("5") || figura.equalsIgnoreCase("����")) {

            double pi = 3.14;

            System.out.println("������� ���� �� ���� �����: ");
            String osA = scanner.nextLine();
            double a = Integer.parseInt(osA);

            System.out.println("������� ������ ��� �����: ");
            String osB = scanner.nextLine();
            double b = Integer.parseInt(osB);

            double S = a / 2 * b / 2 * pi;
            double P = 2 * pi * Math.sqrt((a * a + b * b) / 8);

            System.out.println("�������� �����: " + P);
            System.out.println("������� �����: " + S);

        }
    }
}