package lesson5;

public class Main6 {
    public static void main(String[] args) {
        /**
         * ≈сть текст (email от пользовател€)
         * нужно пон€ть валидный он или нет?
         */

        String email = "nikas1994@inbox.ru";


        if (!email.contains("@")) {
            System.out.println("Ёмайл не содержит собачку!!!");
            return;
        }
        if (email.contains("..")) {
            System.out.println("Ёмайл содержит две точки!!!");
            return;
        }
        if (email.contains(".@")) {
            System.out.println("“очка €вл€етс€ последней в локальной части!!!");
            return;
        }

        long quantityDog = email.codePoints().filter(ch -> ch == '@').count();
        if (quantityDog != 1) {
            System.out.println("Ёмайл содержит несколько собачек!!!");
            return;
        }


        if (email.contains(" ")) {
            System.out.println("Ёмайл содержит пробел!!!");
            return;
        }

        String russianAlphabet = "абвгдеЄжзийклмнопрстуфхцчшщъыьэю€јЅ¬√ƒ≈®∆«»… ЋћЌќѕ–—“”‘’÷„ЎўЏџ№Ёёя";
        for (int i = 0; i < email.length(); i++) {
            char currentCharFromEmail = email.charAt(i);
            for (int j = 0; j < russianAlphabet.length(); j++) {
                char currentCharFromRussianAlphabet = russianAlphabet.charAt(j);
                if (currentCharFromEmail == currentCharFromRussianAlphabet) {
                    System.out.println("Ёмайл содержит киррилицу!!!");
                    return;
                }
            }

        }

        String unacceptableSymbols = "(),:;<>[ \\ !#$%*/?^`{|}~]";
        for (int i = 0; i < email.length(); i++) {
            char currentCharFromEmail = email.charAt(i);
            for (int j = 0; j < unacceptableSymbols.length(); j++) {
                char currentCharFromUnacceptableSymbols = unacceptableSymbols.charAt(j);
                if (currentCharFromEmail == currentCharFromUnacceptableSymbols) {
                    System.out.println("Ёмайл содержит недопустимые символы!!!");
                    return;
                }
            }

        }

        if (!email.endsWith(".ru") && !email.endsWith(".com") && !email.endsWith(".net")) {
            System.out.println("ќтсутствует домен верхнего уровн€!!!");
        }


        /**
         * 2 - содержание пробелов
         * 3 - чтобы содержалась одна собачка
         * 4 - чтобы не начиналось на спецсимвол
         *
         */
    }
}
