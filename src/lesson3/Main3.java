package lesson3;

public class Main3 {
    public static void main(String[] args) {

        char[] chars = {'w', 'd', 'e', '@', '$', '&', '9', '4'};

        //посчитать количество цифр в массиве

        int count = 0;

        for (int i = 0; i < chars.length; i++) {

            char ch = chars[i];
            if (ch == '0' || ch == '1' || ch == '2' || ch == '3' || ch == '4' || ch == '5' || ch == '6' || ch == '7' || ch == '8' || ch == '9') {
                count++;
            }

        }
        System.out.println(count);
    }
}
