package lesson4;

import java.util.Scanner;

//*** Напечатать все туры от ... до ... дней

public class HomeWork4_4 {
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
        System.out.println("На какой срок рассчитываете?");
        //выводим +- 1день от предложенного кол-ва дней.

        Scanner scanner = new Scanner(System.in);
        String quantityDayStr = scanner.nextLine();
        int quantityDay = Integer.parseInt(quantityDayStr);


        for (int i = 0; i < tours.length; i++) {
            String numbersAndStrDayStr = tours[i][2];
            numbersAndStrDayStr = numbersAndStrDayStr.replaceAll("\\D+", "");
            int numbersAndStrDay = Integer.parseInt(numbersAndStrDayStr);
            if ((quantityDay - 1) <= numbersAndStrDay && numbersAndStrDay <= (quantityDay + 1)) {
                System.out.printf("%s, %s рублей, на %s, %s\n", tours[i][0], tours[i][1], tours[i][2], tours[i][3]);
            }
        }

    }

}

