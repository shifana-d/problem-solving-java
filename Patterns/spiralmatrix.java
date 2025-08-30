public class spiralmatrix {

     public static void printSpiral(int size) {
        int[][] matrix = new int[size][size];
        int num = 1;
        int topRow = 0, bottomRow = size - 1, leftCol = 0, rightCol = size - 1;

        while (topRow <= bottomRow && leftCol <= rightCol) {
            // Fill top row
            for (int i = leftCol; i <= rightCol; i++) {
                matrix[topRow][i] = num++;
            }
            topRow++;

            // Fill right column
            for (int i = topRow; i <= bottomRow; i++) {
                matrix[i][rightCol] = num++;
            }
            rightCol--;

            // Fill bottom row
            if (topRow <= bottomRow) {
                for (int i = rightCol; i >= leftCol; i--) {
                    matrix[bottomRow][i] = num++;
                }
                bottomRow--;
            }

            // Fill left column
            if (leftCol <= rightCol) {
                for (int i = bottomRow; i >= topRow; i--) {
                    matrix[i][leftCol] = num++;
                }
                leftCol++;
            }
        }

        // Print the matrix
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(matrix[i][j] + "\t"); // Using tab for better alignment
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int size = 5;// Example size
        printSpiral(size);
    }
}