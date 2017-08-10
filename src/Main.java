/**
 * Created by sebas on 21.12.2016.
 */

public class Main {

    public static void main(String[] args) {

        Matrix matrix = new Matrix(0, 0, 5);
        //Matrix matrix2 = new Matrix(matrix);
        System.out.println(matrix.toString());
        //System.out.println("Ist Matrix quadratisch? " + matrix.isSquare());
        //matrix.set(5,3,2);
        System.out.println(matrix.toString());
        System.out.println("Spalten:     " + matrix.columns());
        System.out.println("Zeilen:      " + matrix.rows());
        //System.out.println("Element 1,1: " + matrix.get(1,1));
        //System.out.println("Element 5,3: " + matrix.get(5,3));
        //System.out.println("Ist Matrix symmetrisch? " + matrix.isSymmetric() + "\n\n");

        /*matrix.set(3, 2, 4);
        System.out.println(matrix.toString());
        System.out.println("Ist Matrix symmetrisch? " + matrix.isSymmetric() + "\n\n");

        matrix.set(2, 3, 4);
        System.out.println(matrix.toString());
        System.out.println("Ist Matrix symmetrisch? " + matrix.isSymmetric() + "\n\n");*/

    }
}