package lesson3;

public class Main4 {
    public static void main(String[] args) {
        String text = "Hello world!";
        int lengthOfText = text.length();

        if (lengthOfText < 10) {
            System.out.println("Это короткий текст");
        } else {
            System.out.println("Длинный текст");
        }
    }
}
