package lesson12;

public class Coin implements Comparable<Coin> {
    private int nominal;
    private double diametr;
    private int year;
    private String metall;

    public Coin() {

    }

    public Coin(int nominal, double diametr, int year, String metall) {
        this.nominal = nominal;
        this.diametr = diametr;
        this.year = year;
        this.metall = metall;
    }

    public int getNominal() {
        return nominal;
    }

    public void setNominal(int nominal) {
        this.nominal = nominal;
    }

    public double getDiametr() {
        return diametr;
    }

    public void setDiametr(double diametr) {
        this.diametr = diametr;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getMetall() {
        return metall;
    }

    public void setMetall(String metall) {
        this.metall = metall;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Coin coin = (Coin) o;

        if (nominal != coin.nominal) return false;
        if (Double.compare(coin.diametr, diametr) != 0) return false;
        if (year != coin.year) return false;
        return metall != null ? metall.equals(coin.metall) : coin.metall == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = nominal;
        temp = Double.doubleToLongBits(diametr);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + year;
        result = 31 * result + (metall != null ? metall.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Монета {" +
                "Номинал = " + nominal +
                ", Диаметр = " + diametr +
                ", Год выпуска = " + year +
                ", Металл = '" + metall + '\'' +
                '}';
    }

    @Override
    public int compareTo(Coin o) {
        if (this.getNominal() != o.getNominal()) {
            return this.getNominal()-o.getNominal();
        }
        if (this.getDiametr() != o.getDiametr()){
            return Double.compare(this.getDiametr(), o.getDiametr());
        }
        if(this.getYear() != o.getYear()){
            return this.getYear() - o.getYear();
        }

        if(!this.getMetall().equals(o.getMetall())){
            return this.getMetall().compareTo(o.getMetall());
        }
        return 0;
    }
}
