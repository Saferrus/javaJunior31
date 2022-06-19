package lesson14;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringUtilsImple implements StringUtils {
    @Override
    public double div(String number1, String number2) throws NullPointerException, NumberFormatException, ArithmeticException {
        if (number1 == null || number2 == null) {
            throw new NullPointerException("number1 == 0 || number2 == 0");
        }
        double num1;
        double num2;
        try {
            num1 = Double.parseDouble(number1);
        } catch (NumberFormatException e) {
            throw new NumberFormatException("number1 - не число");
        }
        try {
            num2 = Double.parseDouble(number2);
        } catch (NumberFormatException e) {
            throw new NumberFormatException("number2 - не число");
        }

        if (num2 == 0) {
            throw new ArithmeticException("На ноль делит нельзя");
        }

        return num1 / num2;
    }

    @Override
    public int[] findWord(String text, String word) throws NullPointerException {
        if (text == null || word == null) {
            throw new NullPointerException("text == null || word ==null");
        }
        String[] words = text.split("\\p{P}?[ \\t\\n\\r]+");
        ArrayList<Integer> resultList = new ArrayList<>();

        for (int i = 0; i < words.length; i++) {
            if (words[i].toLowerCase().contains(word.toLowerCase())) {
                resultList.add(i);
            }
        }
        int[] result = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            result[i] = resultList.get(i);
        }


        return result;
    }

    @Override
    public double[] findNumbers(String text) throws CustomException {
        Pattern pattern = Pattern.compile("[-+]?[0-9]*\\.?[0-9]+([eE][-+]?[0-9]+)?");
        Matcher m = pattern.matcher(text);

        ArrayList<Double> doubls = new ArrayList<>();
        while (m.find()) {
            doubls.add(Double.parseDouble(m.group()));
        }
        if (doubls.size() == 0) {
            throw new CustomException("Чисел в тексте нет");
        }
        double[] result = new double[doubls.size()];
        for (int i = 0; i < doubls.size(); i++) {
            result[i] = doubls.get(i);
        }

        return result;
    }
}
