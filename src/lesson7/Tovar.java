package lesson7;

public class Tovar {
    // Характеристики (поля класса).
    // Здесь могут быть переменные, которые относятся ТОЛЬКО к одному товару (объекту).
    // Не могут быть переменные, которые НЕ описывают состояние объекта.

    private int price;
    private String name;
    private int salePrice;

    public void setName(String name){
        // this - тот объект у которго вызван данный метод
        this.name = name;
    }
    public void setPrice(int price){
        this.price = price;
    }
    public void setSalePrice (int salePrice){
        this.salePrice = salePrice;
    }



    public String getName (){
        return this.name;
    }
    public  int getPrice(){
        return  this.price;
    }
    public  int getSalePrice(){
        return this.salePrice;
    }
}
