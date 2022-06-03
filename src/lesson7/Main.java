package lesson7;

/**
 * Инкапсуляция - это регулирование области видимости с помощью модификатора доступа
 * <p>
 * Всего 4 места:
 * ----перед классом;
 * ----перед переменными;
 * ----перед методами;
 * ----перед конструкторами;
 */

public class Main {
    public static void main(String[] args) {
        Tovar stol = new Tovar();
        Tovar computer = new Tovar();

        stol.setName("Письменный стол 1500х800");
        stol.setSalePrice(9990);
        stol.setPrice(12000);

        computer.setName("Макбук");
        computer.setPrice(210000);
        computer.setSalePrice(170000);
    }
}
