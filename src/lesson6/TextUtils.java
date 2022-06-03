package lesson6;

public class TextUtils {
    /**
     * Создадим метод, в который будем передавать любой текст
     * а метод будет возвращать количество гласных букв в тексте.
     * <p>
     * 1. Модификатор доступа - это одно из 4 слов (видов)
     * Модификатор доступа определяет область видимости данного метода.
     * <p>
     * public - это говорит, что доступно внутри всего проекта.
     * ______(package)(пустой, ни чего не ставить) - доступен внутри текущего пакета(папки).
     * protected - доступен внутри текущего пакета(папки) и дочерним классом.
     * private - доступен внутри текущего файла (текущего класса).
     * <p>
     * 2. static - (пишем или нет)
     * <p>
     * 3. Возвращаемый тип или слово void, если его нет(возварата чего-то).
     * <p>
     * 4. Название метода (видно когда мы его будем вызывать)
     * <p>
     * 5. Явные входящие параметры.
     * <p>
     * 6. Тело выполнения метода.
     */

    public static int countVowels(String text) {
        // text - "dsfsdfsfsdferhbbyffaaaaaeeeqqqyui"
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch == 'a' || ch == 'q' || ch == 'e' || ch == 'o' || ch == 'y' || ch == 'u' || ch == 'i') {
                count++;

            }

        }
        return count;
    }

    /**
     * Метод, который печатает на консоль текст, который мы передали в обратном порядке
     */

    public static void textInReverseOrder(String text) {
        for (int i = text.length() - 1; i >= 0; i--) {
            System.out.print(text.charAt(i));
        }
        System.out.println();
    }

    /**
     * Мы в метод передаем слово, которое нужно закодировать
     * Метод возвращает закодированное слово.
     */

    public static String textToCoding(String text) {

        String alphabet = "abcdefghijklmnopqrstuvwxyza";
        String coddingWords = "";
        for (int i = 0; i < text.length(); i++) {
            char currentCharFromText = text.charAt(i);
            int indexFromAlphabet = alphabet.indexOf(currentCharFromText);
            if (indexFromAlphabet != -1) {
                char charToCodding = alphabet.charAt(indexFromAlphabet + 1);
                coddingWords = coddingWords + charToCodding;

            } else {
                coddingWords = coddingWords + currentCharFromText;
            }

        }
        return coddingWords;
    }
}