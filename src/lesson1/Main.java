package lesson1;

public class Main {
    public static void main(String[] args) {
        //узнаем четное число или нет

        int number = 32;
        int ostatok = number%2;
        //остаток (или 1 или 0 однозначно)
        boolean ischetnoe = ostatok == 0;
        System.out.println(ischetnoe);
    }
}
