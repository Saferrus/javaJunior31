package lesson7;

public class Tovar {
    // �������������� (���� ������).
    // ����� ����� ���� ����������, ������� ��������� ������ � ������ ������ (�������).
    // �� ����� ���� ����������, ������� �� ��������� ��������� �������.

    private int price;
    private String name;
    private int salePrice;

    public void setName(String name){
        // this - ��� ������ � ������� ������ ������ �����
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
