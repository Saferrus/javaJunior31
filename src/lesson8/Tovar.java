package lesson8;

import java.util.ArrayList;

public class Tovar {
    private String article;
    private String fullName;

    /*
    1 - скоро в продаже
    2 - хит продаж
    3 - скоро закончится
    4 -
     */
    private int status;
    private int fullPrice;
    private int salePrice;
    private ArrayList<Otziv> otzivs = new ArrayList<>();

    public String getArticle() {
        return article;
    }

    public void setArticle(String article) {
        this.article = article;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getFullPrice() {
        return fullPrice;
    }

    public void setFullPrice(int fullPrice) {
        this.fullPrice = fullPrice;
    }

    public int getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(int salePrice) {
        this.salePrice = salePrice;
    }

    public ArrayList<Otziv> getOtzivs() {
        return otzivs;
    }

    public void setOtzivs(ArrayList<Otziv> otzivs) {
        this.otzivs = otzivs;
    }

    public void addOtziv (Otziv otziv){
        otzivs.add(otziv);
    }
}
