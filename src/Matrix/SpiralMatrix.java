package matrix;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {

    public static List<Integer> spiralOrder(int[][] matrix) {

        List<Integer> list = new ArrayList<>();
        int n = matrix.length;
        int m = matrix[0].length;
        int left = 0, right = m-1;
        int top  = 0, bottom = n-1;

        int direction = 0;

        while (left <= right && top <= bottom) {
            switch (direction) {
                case 0 -> {
                    for (int i = left; i <= right ; i++) {
                        list.add(matrix[top][i]);
                    }
                    top++;
                }
                case 1 -> {
                    for (int i = top; i <= bottom ; i++) {
                        list.add(matrix[i][right]);
                    }
                    right--;
                }
                case 2 -> {
                    for (int i = right; i >= left ; i--) {
                        list.add(matrix[bottom][i]);
                    }
                    bottom--;
                }
                case 3 -> {
                    for (int i = bottom; i >= top ; i--) {
                        list.add(matrix[i][left]);
                    }
                    left++;
                }
            }
            direction = (direction+1) % 4;
        }
        return list;
    }
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        for (int i : spiralOrder(matrix)) {
            System.out.print(i + " ");
        }
    }
}
