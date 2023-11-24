package Oving6;

import java.util.Arrays;

public class MatriseTest {
    public static void main(String[] args){
        int[][] matrix1 = new int[][]{
                new int[] {1,2},
                new int[] {3,4},
        };
        int[][] matrix2 = new int[][]{
                new int[] {1,7},
                new int[] {3,4},
        };

        Matrise matrise = new Matrise(matrix1,matrix2);

        int [][] sumOfMatrix = matrise.sumMatrix();
        System.out.println("The sum of matrix 1 and matrix 2 is: ");
        for(int[] row:sumOfMatrix){
            System.out.println(Arrays.toString(row));
        }

        int [][] multiplyMatrix = matrise.multiplyMatrix();
        System.out.println("Multiplying matrix 1 with matrix 2 gives us: ");
        for(int[] row:multiplyMatrix){
            System.out.println(Arrays.toString(row));
        }

        int [][] transposedMatrix = matrise.transposeMatrix();
        System.out.println("Transposing matrix 1 gives us: ");
        for(int[] row:transposedMatrix){
            System.out.println(Arrays.toString(row));
        }
    }
}
