package lesson2;

public class Main6 {
    public static void main(String[] args) {
        // напечатать на консоль числа от 30 до 60, которые кратны 3 и 5

        for (int i = 30; i <= 60; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i);

            }
        }
    }
}
