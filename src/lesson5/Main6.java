package lesson5;

public class Main6 {
    public static void main(String[] args) {
        /**
         * ���� ����� (email �� ������������)
         * ����� ������ �������� �� ��� ���?
         */

        String email = "nikas1994@inbox.ru";


        if (!email.contains("@")) {
            System.out.println("����� �� �������� �������!!!");
            return;
        }
        if (email.contains("..")) {
            System.out.println("����� �������� ��� �����!!!");
            return;
        }
        if (email.contains(".@")) {
            System.out.println("����� �������� ��������� � ��������� �����!!!");
            return;
        }

        long quantityDog = email.codePoints().filter(ch -> ch == '@').count();
        if (quantityDog != 1) {
            System.out.println("����� �������� ��������� �������!!!");
            return;
        }


        if (email.contains(" ")) {
            System.out.println("����� �������� ������!!!");
            return;
        }

        String russianAlphabet = "�������������������������������������Ũ��������������������������";
        for (int i = 0; i < email.length(); i++) {
            char currentCharFromEmail = email.charAt(i);
            for (int j = 0; j < russianAlphabet.length(); j++) {
                char currentCharFromRussianAlphabet = russianAlphabet.charAt(j);
                if (currentCharFromEmail == currentCharFromRussianAlphabet) {
                    System.out.println("����� �������� ���������!!!");
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
                    System.out.println("����� �������� ������������ �������!!!");
                    return;
                }
            }

        }

        if (!email.endsWith(".ru") && !email.endsWith(".com") && !email.endsWith(".net")) {
            System.out.println("����������� ����� �������� ������!!!");
        }


        /**
         * 2 - ���������� ��������
         * 3 - ����� ����������� ���� �������
         * 4 - ����� �� ���������� �� ����������
         *
         */
    }
}
