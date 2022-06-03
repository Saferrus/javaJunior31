package lesson2;

public class HomeWork2_4 {
    public static void main(String[] args) {
        //С помощью цикла For, напечатать на консоль:
        //Посчитать сколько нужно лет, чтоб собрать сумму в
        // 200т рублей, если откладывать ежемесячно по 9500т

        int summa = 200000;
        int everyMonth = 9500;
        int year = 0;
        int month = 0;

        for (int i = 0; i <= summa; i += everyMonth) {
            month += 1;
        }
        year = month / 12;
        month = month % 12;

        System.out.println("Для накопления 200 000 руб. потребуется: ");
        System.out.println("Лет: " + year);
        System.out.println("Месяцев: " + month);
    }
}
