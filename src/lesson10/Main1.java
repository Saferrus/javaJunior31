package lesson10;

public class Main1 {
    public static void main(String[] args) {

        Matrix test = new Matrix(3, 3);

        double[][] num1 = {{2, 5, 6, 7},
                {4, 6, 8, 9},
                {7, 1, 3, 7}};

        Matrix matrix1 = new Matrix(num1);

        double[][] num2 = { {1, 3, 4, 9},
                            {5, 4, 1, 3},
                            {2, 4, 6, 5}};

        double[][] num3 = {  {1, 0, 0},
                             {0,1,0},
                             {0,0, 1}};

        Matrix matrix2 = new Matrix(num2);

        Matrix matrix3 = new Matrix(num3);
        boolean a = matrix3.isIdentityMatrix();
        System.out.println(a);

    }
}
