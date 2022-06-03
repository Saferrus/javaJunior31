package lesson2;

public class HomeWork2_3 {
    public static void main(String[] args) {
        //С помощью цикла For, напечатать на консоль
        //Кол-во четных чисел в диапазоне от 30 до 61
        int count = 0;
        for (int i = 30; i <= 61; i++) {
            if (i % 2 == 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}
