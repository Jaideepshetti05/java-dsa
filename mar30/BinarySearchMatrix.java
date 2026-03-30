public class BinarySearchMatrix {
    public static boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        int col = matrix[0].length;

        int left = 0, right = row * col - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            int value = matrix[mid / col][mid % col];

            if (value == target) return true;
            else if (value < target) left = mid + 1;
            else right = mid - 1;
        }
        return false;
    }
}