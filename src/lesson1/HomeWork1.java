package lesson1;

public class HomeWork1 {
    public static void main(String[] args) {
        double myMoney = 1000;
        double costPizza = 230;
        double costGum = 26;
        double costCandies = 2.5;
        System.out.println("На эти деньги мы можем купить: ");

        int maxCountPizzaBuyInsertMarket = (int) (myMoney / costPizza);
        double pricePizzas = maxCountPizzaBuyInsertMarket * costPizza;
        System.out.println(maxCountPizzaBuyInsertMarket + " пиццы");


        myMoney -= pricePizzas;


        int maxCountGumBuyInsertMarekt = (int) (myMoney / costGum);
        double priceGums = maxCountGumBuyInsertMarekt * costGum;
        System.out.println(maxCountGumBuyInsertMarekt + " жвачки");

        myMoney -= priceGums;

        int maxCountCandiesBuyInsertMarket = (int) (myMoney / costCandies);
        double priceCandies = (maxCountCandiesBuyInsertMarket * costCandies);
        System.out.println(maxCountCandiesBuyInsertMarket + " конфет");

        myMoney -= priceCandies;


        System.out.println("Сдача с магазина: " + myMoney + " рубля");


    }
}
