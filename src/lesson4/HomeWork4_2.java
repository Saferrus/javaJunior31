package lesson4;

import java.util.Scanner;

// ... - ввод с клавиатуры
// 2 - Напечатать все туры в ... страну ... транспортом

public class HomeWork4_2 {
    public static void main(String[] args) {
        String[][] tours = {{"Турция", "100000", "6 дней", "самолет"},
                {"Египет", "150000", "5 дней", "самолет"},
                {"Куба", "170000", "4 дней", "самолет"},
                {"Карелия", "160000", "10 дней", "автобус"},
                {"Мальдивы", "190000", "6 дней", "самолет"},
                {"Тунис", "175000", "7 дней", "самолет"},
                {"Кипр", "192000", "3 дня", "самолет"},
                {"Тунис", "115000", "4 дня", "самолет"},
                {"Сочи", "100000", "6 дней", "автобус"},
                {"Сочи", "120000", "6 дней", "самолет"},
                {"Египет", "120000", "6 дней", "самолет"}};



        Scanner scanner = new Scanner(System.in);

        System.out.println("Какой курорт предпочитаете?");
        String country = scanner.nextLine();

        System.out.println("Каким транспортом хотели бы воспользоваться?");
        String transport = scanner.nextLine();

        for (int i = 0; i < tours.length; i++) {
            String countryFromTours = tours[i][0];
            String transportFromTours = tours[i][3];
            if (country.equalsIgnoreCase(countryFromTours) && transport.equalsIgnoreCase(transportFromTours)) {
                System.out.printf("%s, за %s рублей, на %s, %s\n", tours[i][0], tours[i][1], tours[i][2], tours[i][3]);
            }


        }
    }
}