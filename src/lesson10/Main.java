package lesson10;

public class Main {
    public static void main(String[] args) {
        Tiger tiger1 = new Tiger();
        Tiger tiger2 = new Tiger();


        Monkey monkey1 = new Monkey();
        Monkey monkey2 = new Monkey();

        ZooAnimal[] animals = new ZooAnimal[4];
        animals[0] = monkey1;
        animals[1] = monkey2;
        animals[2] = tiger2;
        animals[3] = tiger1;

        //for each
        for (ZooAnimal animal:animals){
            animal.voice();
        }
    }
}
