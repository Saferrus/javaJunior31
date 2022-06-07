package lesson10;

public class Main1 {
    public static void main(String[] args) {

        Matrix test = new Matrix(3, 3);

        double[][] num1 = {  {2, 5, 6},
                             {4, 6, 8},
                             {7, 1, 3}};

        Matrix matrix1 = new Matrix(num1);

        double[][] num2 = { {1, 3, 4 },
                            {5, 4, 1},
                            {2, 4, 6}};

        double[][] num3 = {  {1, 0, 0},
                             {0,1,0},
                             {0,0, 1}};

        Matrix matrix2 = new Matrix(num2);

       Matrix result = matrix1.mul(matrix2);
       result.printToConsole();
    }
}
