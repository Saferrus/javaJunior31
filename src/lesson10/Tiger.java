package lesson10;

public class Tiger implements ZooAnimal{
    @Override
    public void voice() {
        System.out.println("��������������������");
    }

    @Override
    public void jump() {
        System.out.println("���� �������");
    }

    @Override
    public void run() {
        System.out.println("���� ������");
    }
}
