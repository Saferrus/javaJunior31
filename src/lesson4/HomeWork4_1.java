package lesson4;

import java.util.Scanner;

// ... - ввод с клавиатуры
// 1 - Напечатать все туры в ... страну


public class HomeWork4_1 {
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
                {"Египет", "120000", "6 дней", "самолет"}};
        System.out.println("Какой курорт предпочитаете?");


        Scanner scanner = new Scanner(System.in);

        String country = scanner.nextLine();

        for (int i = 0; i < tours.length; i++) {
            String countryFromTours = tours[i][0];
            if (country.equalsIgnoreCase(countryFromTours)) {
                System.out.printf("%s, за %s рублей, на %s, %s\n", tours[i][0], tours[i][1], tours[i][2], tours[i][3]);
            }


        }


    }
}
