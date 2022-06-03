package lesson5;

public class Main5 {
    public static void main(String[] args) {
        /**
         * ���� �����, ������� ����� ������������
         * ����������� - ��� ������ ������� �� ��������� ������ � ��������
         * �������� ������ �����, ��� ��������
         * ��� �� ��������� �������� ��������� �����
         *
         */

        String text = "currentCharFromText text.length";
        String alphabet = "abcdefghijklmnopqrstuvwxyza";

        for (int i = 0; i < text.length(); i++) {
            char currentCharFromText = text.charAt(i);
            int indexFromAlphabet = alphabet.indexOf(currentCharFromText);
            if (indexFromAlphabet != -1) {
                char charToCodding = alphabet.charAt(indexFromAlphabet + 1);
                System.out.print(charToCodding);

            } else {
                System.out.print(currentCharFromText);
            }

        }
    }
}
