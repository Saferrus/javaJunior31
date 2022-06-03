package lesson4;

import java.util.Scanner;

public class Main3 {
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
        System.out.println("На какой бюджет расчитываете?");
        //70 000 - выводим +- 15к от предложенной цены.

        Scanner scanner = new Scanner(System.in);
        String moneyStr = scanner.nextLine();

        int money = Integer.parseInt(moneyStr);// 80 000; 70 000

        for (int i = 0; i < tours.length; i++) {
            String priceFromCurrentTourStr = tours[i][1];
            int priceFromCurrentTour = Integer.parseInt(priceFromCurrentTourStr);

            if ((money - 15000) <= priceFromCurrentTour && priceFromCurrentTour <= (money + 15000)) {
                System.out.printf("%s, %s рублей, на %s, %s\n", tours[i][0], tours[i][1], tours[i][2], tours[i][3]);

            }

        }
        // ... - ввод с клавиатуры
        // 1 - Напечатать все туры в ... страну
        // 2 - Напечатать все туры в ... страну ... транспортом
        // 3 - Средняя стоимость всех туров
        //*** Напечатать все туры от ... до ... дней
        //***** Напечатать туры на Ваш взгляд более привликательные для покупателя


    }

}

