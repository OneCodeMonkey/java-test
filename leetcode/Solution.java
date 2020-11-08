package leetcode;

import leetcode.problems.*;

class Solution {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        RotateImage rotateImage = new RotateImage();

        rotateImage.printMatrix(matrix);

        rotateImage.rotate(matrix);
        rotateImage.printMatrix(matrix);

        rotateImage.anti_rotate(matrix);
        rotateImage.printMatrix(matrix);

        System.out.println("hello world");
    }
}
