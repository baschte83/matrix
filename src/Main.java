/**
 * Organisation: University of applied sciences Munich, faculty 07
 * Project: lab to class software developement 1 Mrs. Prof. Dr. Hammerschall, WS 2016/2017
 * Author: Sebastian Baumann, sebastian_baumann@gmx.net
 * Study group: IF3A
 * Date: 21. December 2016
 * Purpose: solution to lab Matrix
 */
public class Main {

    public static void main(String[] args) {

        Matrix matrix = new Matrix(0, 0, 5);
        Matrix matrix2 = new Matrix(matrix);
        System.out.println(matrix.toString());
        System.out.println("Ist Matrix quadratisch? " + matrix.isSquare());
        matrix.set(5, 3, 2);
        System.out.println(matrix.toString());
        System.out.println(matrix2.toString());
        System.out.println("Spalten:     " + matrix.columns());
        System.out.println("Zeilen:      " + matrix.rows());
        System.out.println("Element 1,1: " + matrix.get(1, 1));
        System.out.println("Element 5,3: " + matrix.get(5, 3));
        System.out.println("Ist Matrix symmetrisch? " + matrix.isSymmetric() + "\n\n");

        matrix.transpose();
        System.out.println(matrix.toString());

    }
}