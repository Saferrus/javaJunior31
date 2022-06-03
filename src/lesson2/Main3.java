package lesson2;

public class Main3 {
    public static void main(String[] args) {


        int mark = 10;

        switch (mark){
            case 5:
                System.out.println("Отлично!");
                break;
            case 4:
                System.out.println("Хорошо!");
                break;
            case 3:
                System.out.println("Удолитворительно!");
                break;
            case 2:
                System.out.println("На завод!");
                break;
            default:
                System.out.println("Промой глаза!");
        }
    }
}
