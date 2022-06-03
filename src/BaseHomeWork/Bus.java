package BaseHomeWork;

public class Bus extends Vehicle {
    private int people;
    private int max_people;

    public Bus() {
    }

    public Bus(double amountPetrol, double volumeTank, int people, int max_people) {
        super(amountPetrol, volumeTank);
        this.people = people;
        this.max_people = max_people;
    }

    public int getPeopleCount() {
        return people;
    }


    public int getMaxPeople() {
        return max_people;
    }

    @Override
    public void arrive() {
        super.arrive();
        Base.people_on_base += people;
    }

    @Override
    public boolean leave() {
        if (Base.people_on_base > 0 &  Base.vehicles_on_base > 0) {
            Base.people_on_base = Base.people_on_base - getCountDriver();
            Base.vehicles_on_base = Base.vehicles_on_base - getCountDriver();
            if (Base.petrol_on_base >= (getTankVolume() - getPetrolAmount())){
                Base.petrol_on_base = Base.petrol_on_base - (getTankVolume() - getPetrolAmount());
            }else {
                Base.petrol_on_base-=Base.petrol_on_base;
            }
            if (Base.people_on_base >= max_people) {
                Base.people_on_base -= max_people;
            } else {
                Base.people_on_base -= Base.people_on_base;
            }
        }

        return false;

    }
}

