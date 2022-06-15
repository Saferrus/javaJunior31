package lesson14;

public class Person {
    private int age;
    private String name;

    public void setAge(int age) throws UncurrentAgeException {
        //1 - Ручная генерация "Эксэпшена"
        if (age < 0 || age > 150) {
            throw new UncurrentAgeException("age < 0 || age > 150");
        }
        this.age = age;
    }
}
