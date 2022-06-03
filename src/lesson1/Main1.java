package lesson1;

public class Main1 {
    public static void main(String[] args) {
        //есть ширина и длина комнаты, есть ширина и длина стола
        // нужно посчитать сколько столов влезет в комнату

        double shirinaRoom = 3.4;
        double dlinaRoom = 2;

        double shirinaTable = 0.8;
        double dlinnaTable = 1.5;

        double ploshadRoom = shirinaRoom * dlinaRoom;
        double ploshadTable = shirinaTable * dlinnaTable;

        int countTableInsertToRoom = (int) (ploshadRoom/ploshadTable);  //приведение типов бывает нисходящие и вверхходящее
        System.out.println(countTableInsertToRoom);

    }
}
