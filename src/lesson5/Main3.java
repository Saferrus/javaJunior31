package lesson5;

public class Main3 {
    public static void main(String[] args) {
        /**
         *  У нас есть текст. Задача: в тексте необходимо полностью убрать знаки препинания.
         */

        String text = "У нас есть текст. Задача: в тексте необходимо полностью убрать знаки препинания.";
        text = text.replace('.', '\0');
        text = text.replace(':', '\0');
        System.out.println(text);
    }
}
