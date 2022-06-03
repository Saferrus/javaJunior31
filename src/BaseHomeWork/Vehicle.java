package BaseHomeWork;

public class Vehicle extends Base {
    private int countDriver = 1;
    private double petrolAmount;
    private double tankVolume;


    public Vehicle() {
    }

    public Vehicle(double petrolAmount, double tankVolume) {
        this.petrolAmount = petrolAmount;
        this.tankVolume = tankVolume;
    }

    public int getCountDriver() {
        return countDriver;
    }

    public double getPetrolAmount() {
        return petrolAmount;
    }

    public void setPetrolAmount(double petrolAmount) {
        this.petrolAmount = petrolAmount;
    }

    public double getTankVolume() {
        return tankVolume;
    }

    public void setTankVolume(double tankVolume) {
        this.tankVolume = tankVolume;
    }

    public void arrive() {
        Base.vehicles_on_base = Base.vehicles_on_base + countDriver;
        Base.people_on_base = Base.people_on_base + countDriver;

    }

    public boolean leave() {
        if (Base.people_on_base > 0 &  Base.vehicles_on_base > 0) {
            Base.people_on_base = Base.people_on_base - countDriver;
            Base.vehicles_on_base = Base.vehicles_on_base - countDriver;
            if (Base.petrol_on_base >= (tankVolume - petrolAmount)){
                Base.petrol_on_base = Base.petrol_on_base - (tankVolume - petrolAmount);
            }else {
                Base.petrol_on_base-=Base.petrol_on_base;
            }

        }

        return false;
    }


}
