package MySimulator;

public class Test {
    public static void main(String[] args) {

        int[] mas = new int[20];
        int count = 0;


        for (int i = 0; i < mas.length; i++) {
            mas[i] = ((int) (Math.random() * 1000));

            int a = (mas[i] - mas[i] % 100) / 100;
            int b = (mas[i] / 10) % 10;
            int c = mas[i] % 10;
            int sum = 0;
            if (a == c & c!=0) {
                count += 1;
                sum += a + b + c;
                System.out.println(sum);
                System.out.println(mas[i] + " ");

            }

        }
        System.out.println(count);


    }
}


