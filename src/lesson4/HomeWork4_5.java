package lesson4;


//***** Напечатать туры на Ваш взгляд более привликательные для покупателя

public class HomeWork4_5 {
    public static void main(String[] args) {
        String[][] tours = {{"Турция", "100000", "6 дней", "самолет"},
                {"Египет", "150000", "5 дней", "самолет"},
                {"Куба", "170000", "4 дней", "самолет"},
                {"Карелия", "160000", "10 дней", "автобус"},
                {"Мальдивы", "190000", "6 дней", "самолет"},
                {"Тунис", "175000", "7 дней", "самолет"},
                {"Кипр", "192000", "3 дня", "самолет"},
                {"Тунис", "115000", "4 дня", "самолет"},
                {"Сочи", "100000", "6 дней", "автобус"},
                {"Сочи", "120000", "6 дней", "самолет"},
                {"Египет", "120000", "6 дней", "самолет"}};
        System.out.print("Специально для Вас выгодное предложение: ");


        int[][] vigodnoePredlozhenie = new int[tours.length][2];
        for (int i = 0; i < tours.length; i++) {
            String numbersAndStrDayStr = tours[i][2];
            numbersAndStrDayStr = numbersAndStrDayStr.replaceAll("\\D+", "");
            int numbersAndStrDay = Integer.parseInt(numbersAndStrDayStr);

            String countToursStr = tours[i][1];
            int countTours = Integer.parseInt(countToursStr);

            vigodnoePredlozhenie[i][0] = countTours / numbersAndStrDay;
            vigodnoePredlozhenie[i][1] = i;
        }
        int min = vigodnoePredlozhenie[0][0];

        for (int i = 1; i < vigodnoePredlozhenie.length; i++) {
            if (vigodnoePredlozhenie[i][0] < min) {
                min = vigodnoePredlozhenie[i][0];

            }
        }
        System.out.println(min + "  +- 3000 рублей за один день отдыха");
        System.out.println("");

        for (int i = 0; i < vigodnoePredlozhenie.length; i++) {
            if ((min - 3000) < vigodnoePredlozhenie[i][0] && vigodnoePredlozhenie[i][0] < (min + 3000)) {
                System.out.printf("%s, %s рублей, на %s, %s\n", tours[i][0], tours[i][1], tours[i][2], tours[i][3]);
            }
        }
    }
}
