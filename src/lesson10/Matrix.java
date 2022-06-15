package lesson10;

import javax.print.attribute.standard.MediaSize;

public class Matrix implements IMatrix {
    private double[][] numbers;

    public Matrix(int rows, int cols) {
        numbers = new double[rows][cols];
    }

    public Matrix(double[][] numbers) {
        this.numbers = numbers;
    }


    @Override
    public int getRows() {
        return numbers.length;
    }

    @Override
    public int getColumns() {
        return numbers[0].length;
    }

    @Override
    public double getValueAt(int rowIndex, int colIndex) throws IndexOutOfBoundsException {
        if (rowIndex < 0 || rowIndex >= getRows()) {
            System.out.println("Неверный индекс строки!!! " + rowIndex);
            return 0;
        }
        if (colIndex < 0 || colIndex >= getColumns()) {
            System.out.println("Неверный индекс строки!!! " + colIndex);
            return 0;
        }
        return numbers[rowIndex][colIndex];
    }

    @Override
    public void setValueAt(int rowIndex, int colIndex, double value) throws IndexOutOfBoundsException {
        if (rowIndex < 0 || rowIndex >= getRows()) {
            System.out.println("Неверный индекс строки!!! " + rowIndex);
            return;
        }
        if (colIndex < 0 || colIndex >= getColumns()) {
            System.out.println("Неверный индекс строки!!! " + colIndex);
            return;

        }
        numbers[rowIndex][colIndex] = value;
    }

    @Override
    public Matrix add(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {

        if(otherMatrix == null){
            throw new NullPointerException("otherMatrix == null");
        }


        if (otherMatrix.getRows() != this.getRows()) {
            throw new IllegalArgumentException("Строки матриц не совпадают");
        }
        if (otherMatrix.getColumns() != this.getColumns()) {
            throw new IllegalArgumentException("Колонки матриц не совпадают");
        }
        Matrix result = new Matrix(this.getRows(), this.getColumns());
        for (int i = 0; i < result.getRows(); i++) {
            for (int j = 0; j < result.getColumns(); j++) {
                result.setValueAt(i, j, this.getValueAt(i, j) + otherMatrix.getValueAt(i, j));
            }
        }

        return result;
    }

    @Override
    public Matrix sub(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {
        if (otherMatrix.getRows() != this.getRows()) {
            System.out.println("Строки матриц не совпадают");
            return null;
        }
        if (otherMatrix.getColumns() != this.getColumns()) {
            System.out.println("Колонки матриц не совпадают");
            return null;
        }
        Matrix result = new Matrix(this.getRows(), this.getColumns());
        for (int i = 0; i < result.getRows(); i++) {
            for (int j = 0; j < result.getColumns(); j++) {
                result.setValueAt(i, j, this.getValueAt(i, j) - otherMatrix.getValueAt(i, j));
            }
        }
        return result;
    }

    @Override
    public Matrix mul(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {
        if (otherMatrix.getRows() != this.getRows()) {
            System.out.println("Строки матриц не совпадают");
            return null;
        }
        if (otherMatrix.getColumns() != this.getColumns()) {
            System.out.println("Колонки матриц не совпадают");
            return null;
        }
        Matrix result = new Matrix(this.getRows(), this.getColumns());
        for (int i = 0; i < this.getRows(); i++) {
            for (int j = 0; j < otherMatrix.getColumns(); j++) {
                for (int k = 0; k < this.getColumns(); k++) { // aColumn
                    result.setValueAt(i,j,(result.getValueAt(i,j) + this.getValueAt(i,k)* otherMatrix.getValueAt(k,j)));
                }
            }
        }

        return result;
    }

    @Override
    public Matrix mul(double value) {

        Matrix result = new Matrix(this.getRows(), this.getColumns());
        for (int i = 0; i < result.getRows(); i++) {
            for (int j = 0; j < result.getColumns(); j++) {
                result.setValueAt(i, j, this.getValueAt(i, j) * value);
            }
        }
        return result;
    }

    @Override
    public Matrix transpose() {
        Matrix result = new Matrix(this.getColumns(), this.getRows());
        for (int i = 0; i < result.getRows(); i++) {
            for (int j = 0; j < result.getColumns(); j++) {
                result.setValueAt(i, j, this.getValueAt(j, i));
            }
        }
        return result;
    }

    @Override
    public void fillMatrix(double value) {
        for (int i = 0; i < this.getRows(); i++) {
            for (int j = 0; j < this.getColumns(); j++) {
                this.setValueAt(i, j, value);
            }
        }


    }
    //Метод для вычисления детерминанта
    private Matrix arrayOfRange(int n, int m) {

        Matrix matrix = new Matrix(this.getRows() - 1, this.getColumns() - 1);
        int row_sub = 0;

        for (int row = 0; row < this.getRows(); row++) {

            int col_sub = 0;
            if (row != n) {

                for (int col = 0; col < numbers[row].length; col++) {

                    if (col != m) {
                        matrix.setValueAt(row - row_sub, col - col_sub, this.getValueAt(row, col));
                    } else {
                        col_sub = 1;
                    }

                }

            } else {
                row_sub = 1;
            }

        }

        return matrix;
    }

    @Override
    public double determinant() {
        if (this.getRows() != this.getColumns()) {
            System.out.println("Матрица не квадратная");
            return 0;
        }
        if (this.getRows() == 2) {
            return (getValueAt(0, 0) * getValueAt(1, 1)) - (getValueAt(0, 1) * getValueAt(1, 0));
        } else {
            int total = 0;
            for (int n = 0; n < this.getRows(); n++) {

                // Get the array excluding the first row and current column (n)
                Matrix matrix = this.arrayOfRange(0, n);

                if (n % 2 == 0) {
                    total += this.getValueAt(0, n) * matrix.determinant();
                } else {
                    total -= this.getValueAt(0, n) * matrix.determinant();
                }

            }

            return total;
        }
    }

    @Override
    public boolean isNullMatrix() {
        for (int i = 0; i < this.getRows(); i++) {
            for (int j = 0; j < this.getColumns(); j++) {
                if (this.getValueAt(i, j) != 0) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override
    public boolean isIdentityMatrix() {

        for (int i = 0; i < this.getRows(); i++) {
            for (int j = 0; j < this.getColumns(); j++) {
                if (i == j) {
                    if (getValueAt(i, j) != 1) {
                        return false;

                    }
                } else {
                    if (getValueAt(i, j) != 0) {
                        return false;
                    }
                }
            }

        }
        return true;
    }

    @Override
    public boolean isSquareMatrix() {
        if (this.getRows() == this.getColumns()) {
            return true;
        }
        return false;
    }

    @Override
    public void printToConsole() {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
    }

}