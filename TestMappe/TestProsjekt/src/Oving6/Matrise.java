package Oving6;

public class Matrise {
    private int[][] matrix1;
    private int[][] matrix2;

    private int[][] newMatrix;
    public Matrise(int[][] matrix1, int[][] matrix2){
        this.matrix1 = matrix1;
        this.matrix2 = matrix2;
    }

    public int[][] sumMatrix(){
        int lenRowMatrix1 = matrix1.length;
        int lenColMatrix1 = matrix1[0].length;
        int lenRowMatrix2 = matrix2.length;
        int lenColMatrix2 = matrix2[0].length;

        if((lenRowMatrix1 != lenRowMatrix2) || (lenColMatrix1 != lenColMatrix2)){
            return null;
        }

        newMatrix = new int[lenRowMatrix1][lenColMatrix1];

        for(int row=0; row < newMatrix.length; row++){
            for(int col=0; col < newMatrix[0].length; col++){
                newMatrix[row][col] = matrix1[row][col] + matrix2[row][col];
            }
        }
        return newMatrix;
    }

    public int[][] multiplyMatrix(){
        int lenRowMatrix1 = matrix1.length;
        int lenColMatrix2 = matrix2[0].length;
        newMatrix = new int[lenRowMatrix1][lenColMatrix2];

        if(lenRowMatrix1 != lenColMatrix2){
            return null;
        }

        for(int row=0; row < newMatrix.length; row++){
            for(int col=0; col < newMatrix[0].length; col++){
                for (int k = 0; k < newMatrix.length; k++){
                    newMatrix[row][col] += matrix1[row][k] * matrix2[k][col];
                }
            }
        }
        return newMatrix;
    }

    public int[][] transposeMatrix(){
        int lenRowMatrix1 = matrix1.length;
        int lenColMatrix1 = matrix1[0].length;

        newMatrix = new int[lenColMatrix1][lenRowMatrix1];

        for(int row=0; row < matrix1.length; row++){
            for(int col=0; col < matrix1[0].length; col++){
                newMatrix[col][row] = matrix1[row][col];
            }
        }
        return newMatrix;
    }
}
