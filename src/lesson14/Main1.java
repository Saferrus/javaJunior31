package lesson14;

public class Main1 {
    public static void main(String[] args) {
        Person person = new Person();

        try {
            person.setAge(149);
            System.out.println("����� �������� �������");
        } catch (UncurrentAgeException e) {
            e.printStackTrace();
        }



        System.out.println("��������� ������ ��������");

    }
}
