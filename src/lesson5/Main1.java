package lesson5;


public class Main1 {
    public static void main(String[] args) {
        String text = "qwerty";
        text = text + "!!!";
        System.out.println(text);

        //формула создания любого объекта
        //String text = new String();
        // 1 - указание типа переменной (тип ссылки)
        // 2 - название переменной (ссылки)
        // 3 - = new (момент создания объекта)
        // 4 - тип объекта();

        // цель собрать такую строчку 1-2-3-4-5... до 100
        String numbers = "";
        for (int i = 0; i <= 100; i++) {
            numbers = numbers + i + "-";
        }
        System.out.println(numbers);
    }
}
