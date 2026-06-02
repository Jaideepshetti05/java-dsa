package jun02;

public class MatrixMultiplication {
    public static int[][] multiplyMatrices(int[][] firstMatrix, int[][] secondMatrix, int r1, int c1, int c2) {
        int[][] product = new int[r1][c2];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < c1; k++) {
                    product[i][j] += firstMatrix[i][k] * secondMatrix[k][j];
                }
            }
        }
        return product;
    }

    public static void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int column : row) {
                System.out.print(column + "    ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int r1 = 2, c1 = 3;
        int r2 = 3, c2 = 2;
        int[][] firstMatrix = { {3, -2, 5}, {3, 0, 4} };
        int[][] secondMatrix = { {2, 3}, {-9, 0}, {0, 4} };

        System.out.println("First Matrix:");
        displayMatrix(firstMatrix);

        System.out.println("Second Matrix:");
        displayMatrix(secondMatrix);

        if (c1 != r2) {
            System.out.println("Multiplication not possible!");
        } else {
            int[][] product = multiplyMatrices(firstMatrix, secondMatrix, r1, c1, c2);
            System.out.println("Product of the two matrices:");
            displayMatrix(product);
        }
    }
}
