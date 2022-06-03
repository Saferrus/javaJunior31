package lesson2;

public class HomeWork2_5 {
    public static void main(String[] args) {
        //С помощью цикла For, напечатать на консоль:
        // Вывести на консоль все числа от 20 до 60,
        // пропуская диапазон от 30 до 40 включительно
        for (int i = 20; i <= 60; i++) {
            if (i >= 20 && i <= 29) {
                System.out.println(i);
            }
            if (i >= 41 && i <= 60) {
                System.out.println(i);
            }
        }
    }
}
