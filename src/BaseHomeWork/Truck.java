package BaseHomeWork;

public class Truck extends Vehicle {
    private double load;
    private double max_load;

    public Truck() {
    }

    public Truck(double petrolAmount, double tankVolume, double load, double max_load) {
        super(petrolAmount, tankVolume);
        this.load = load;
        this.max_load = max_load;
    }

    public double getLoad() {
        return load;
    }

    public double getMax_load() {
        return max_load;
    }

    @Override
    public void arrive() {
        super.arrive();
        Base.goods_on_base += load;
    }

    @Override
    public boolean leave() {
        if (Base.people_on_base > 0 & Base.petrol_on_base >= (getTankVolume() - getPetrolAmount()) & Base.vehicles_on_base > 0) {
            Base.people_on_base = Base.people_on_base - getCountDriver();
            Base.vehicles_on_base = Base.vehicles_on_base - getCountDriver();
            if (Base.petrol_on_base >= (getTankVolume() - getPetrolAmount())) {
                Base.petrol_on_base = Base.petrol_on_base - (getTankVolume() - getPetrolAmount());
            } else {
                Base.petrol_on_base -= Base.petrol_on_base;
            }
            if (Base.goods_on_base >= max_load) {
                Base.goods_on_base -= max_load;
            } else {
                Base.goods_on_base -= Base.goods_on_base;
            }
        }
        return false;
    }

}
