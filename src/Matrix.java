import java.util.Arrays;

/**
 * Organisation: Hochschule Muenchen, Fakultaet 07<br>
 * Project: Praktikum Softwareentwicklung 1 Frau Prof. Dr. Hammerschall, WS 2016/2017<br>
 * Study group: IF3A<br>
 * Date: 21. Dezember 2016<br>
 * Purpose: Loesung Praktikumseinheit 08: Matrix<br>
 * Software: Oracle Java SE JDK 1.8.0_101, Windows 10 x86_64<br>
 * Hardware: Intel Core i5-6300 @ 2.40 GHz 2.50 GHz, 2 Cores, 4096 MB RAM<br>
 *
 * @author Sebastian Baumann
 * @version 0.9
 */

public class Matrix {

    private double[][] matrix;

    private static final double EPSILON = 1E-16;

    /**
     * Constructor to initialize a new matrix-object.
     * This constructor needs two integer parameters for the rows
     * and the columns of the new matrix. Every cell is initialized
     * with 0 as a double value.
     * @param m rows of the new matrix as an integer value.
     * @param n columns of the new matrix as an integer value.
     */
    public Matrix(int m, int n) {
        this.matrix = new double[m][n];
        initialize(m, n, 0.0);
    }

    /**
     * Constructor to initialize a new matrix-object.
     * This constructor needs three parameters for the rows,
     * the columns and the initializing value of each cell
     * of the new matrix.
     * @param m rows of the new matrix as an integer value.
     * @param n columns of the new matrix as an integer value.
     * @param init initialzing value of the new matrix as a double value.
     */
    public Matrix(int m, int n, double init) {
        this.matrix = new double[m][n];
        initialize(m, n, init);
    }

    /**
     * Constructor to initialize a new matrix-object.
     * This constructor needs another matrix object and copies it
     * to this new matrix.
     * @param other another matrix object.
     */
    public Matrix(Matrix other) {
        this.matrix = new double[other.rows()][other.columns()];
        for (int i = 1; i <= other.rows(); i++) {
            for (int j = 1; j <= other.columns(); j++) {
                set(i, j, other.get(i, j));
            }
        }
    }

    /**
     * Gets the amount of rows of this matrix.
     * @return the amount of rows of this matrix as an integer.
     */
    public int rows() {
        return this.matrix.length;
    }

    /**
     * Gets the amount of columns of this matrix.
     * @return the amount of columns of this matrix as an integer.
     */
    public int columns() {
        // returns the length of one line representative for any other
        if (rows() == 0) {
            return 0;
        }
        return this.matrix[0].length;
    }

    /**
     * Gets the value in a certain cell of the matrix-object.
     * This method needs two values to find a specific row an a
     * specific column and returns the found value as a double value.
     * @param r specifies a specific row.
     * @param c specifies a specific column.
     * @return the found value a double value.
     */
    public double get(int r, int c) {
        return this.matrix[r - 1][c - 1];
    }

    /**
     * Sets the given value in a specific cell of this matrix-object.
     * This method needs two values to find a specific row an a
     * specific column to set the given value in it.
     * @param r specifies a specific row.
     * @param c specifies a specific column.
     * @param d specifies a specific value.
     */
    public void set(int r, int c, double d) {
        this.matrix[r - 1][c - 1] = d;
    }

    /**
     * Method transposes the matrix.
     * @return a new matrix-object as the transposed matrix.
     */
    public Matrix transpose() {
        Matrix newMatrix = new Matrix(columns(), rows());
        for (int i = 1; i <= columns(); i++) {
            for (int j = 1; j <= rows(); j++) {
                newMatrix.set(i, j, get(j, i));
            }
        }
        return newMatrix;
    }

    /**
     * Method returns either this matrix is square or not.
     * Method returns true if the amount of rows equates to
     * the amount of columns of this matrix, false otherwise.
     * @return result as a boolean.
     */
    public boolean isSquare() {
        return rows() == columns();
    }

    /**
     * Method returns either the matrix is symmetric or not.
     * Method returns true if any value in row i and column j
     * equates to the corresponding value in row j and column i,
     * false otherwise.
     * @return result as a boolean.
     */
    public boolean isSymmetric() {

        boolean symmetric = false;

        if (isSquare()) {
            for (int i = 1; i <= columns(); i++) {
                for (int j = 1; j <= rows(); j++) {
                    if ((get(i, j) - get(j, i)) > EPSILON) {
                        return false;
                    }
                    symmetric = true;
                }
            }
        }
        return symmetric;
    }

    /**
     * Private assistance method to initialize a new matrix.
     * Method needs three parameters for the amount of rows,
     * the amount of columns and the value, to initiate any cell.
     * @param rows specifies the amount of rows as an integer.
     * @param columns specifies the amount of columns as an integer.
     * @param value  specifies the value to initialize the cells as a double value.
     */
    private void initialize(int rows, int columns, double value) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                this.matrix[i][j] = value;
            }
        }
    }

    /**
     * Print the matrix as strings to the screen.
     * Method uses Array-method deepToString() to print every value
     * of every cell of a multi nested array.
     * @return every value of the array as a string.
     */
    public String toString() {


        return Arrays.deepToString(this.matrix);
        /*String line = "";
        for (int i = 1; i <= rows(); i++) {
            for (int j = 1; j <= columns(); j++) {
                line += get(i, j) + " ";
            }
            line += "\n";
        }
        return line;*/
    }

}