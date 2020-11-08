package leetcode.problems;

/**
 * leetcode_48_Rotate_Image.java
 * 顺时针旋转 90 度一个矩阵。
 * <p>
 * 思路：先上下反转，然后对称翻转矩阵
 * 1 2 3     7 8 9     7 4 1
 * 4 5 6  => 4 5 6  => 8 5 2
 * 7 8 9     1 2 3     9 6 3
 * <p>
 * 2.如果是逆时针旋转 90 度，则先左右翻转，再对称翻转矩阵
 * 1 2 3     3 2 1     3 6 9
 * 4 5 6  => 6 5 4  => 2 5 8
 * 7 8 9     9 8 7     1 4 7
 * (见 anti_rotate(int[][] matrix))
 *
 * @param matrix
 */
public class RotateImage {
    public void rotate(int[][] matrix) {
        int row = matrix.length;
        if (row == 0) {
            return;
        }

        int col = matrix[0].length;
        if (col == 0) {
            return;
        }

        int temp;
        for (int i = 0; i < row / 2; i++) {
            for (int j = 0; j < col; j++) {
                temp = matrix[i][j];
                matrix[i][j] = matrix[row - 1 - i][j];
                matrix[row - 1 - i][j] = temp;
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = i; j < col; j++) {
                temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        return;
    }

    public void anti_rotate(int[][] matrix) {
        int row = matrix.length;
        if (row == 0) {
            return;
        }

        int col = matrix[0].length;
        if (col == 0) {
            return;
        }

        int temp;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col / 2; j++) {
                temp = matrix[i][j];
                matrix[i][j] = matrix[i][col - 1 - j];
                matrix[i][col - 1 - j] = temp;
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = i; j < col; j++) {
                temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        return;
    }

    public void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
