package lesson4;

// 3 - Средняя стоимость всех туров



public class HomeWork4_3 {
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

        int[] count = new int[tours.length];


        for (int i = 0; i < tours.length; i++) {
            String priceFromCurrentTourStr = tours[i][1];
            int priceFromCurrentTour = Integer.parseInt(priceFromCurrentTourStr);
            count[i] = priceFromCurrentTour;

        }
        int summa = 0;
        for (int i : count) {
            summa += i;
        }
        System.out.println("Средняя стоимость тура составляет: " + summa / tours.length);
    }
}
