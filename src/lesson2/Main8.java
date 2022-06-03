package lesson2;

public class Main8 {
    public static void main(String[] args) {
        //сколько мы забереи в банке через 5 лет, если отдадим 100к на депозит под 18% годовых
        //проценты прибавляются ежемесячно

        double money = 100000;
        int year = 5;
        int prosent = 18;


        for(int month = 0; month<=12*year; month++){
            money+=((money/100*prosent)/12);
        }
        System.out.println(money);

    }
}
