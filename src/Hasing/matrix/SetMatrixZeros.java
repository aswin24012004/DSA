package matrix;

import java.util.HashSet;

public class SetMatrixZeros {
    public static void main(String[] args) {
        int[][] matrix = {
                {1,1,1},
                {1,0,1},
                {1,1,1}
        };
        int[][] answer = solution(matrix);
        for (int i = 0; i < answer.length; i++) {
            for (int j = 0; j < answer[0].length; j++) {
                System.out.print(answer[i][j]+" ");
            }
            System.out.println();
        }
    }

    static int[][]  solution(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;

        HashSet<Integer> rows = new HashSet<>();
        HashSet<Integer> cols = new HashSet<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == 0) {
                    rows.add(i);
                    cols.add(j);
                }
            }
        }

        for(int row: rows) {
            for (int i = 0; i < m; i++) {
                matrix[row][i] = 0;
            }
        }

        for(int col: cols) {
            for (int i = 0; i < n; i++) {
                matrix[i][col] = 0;
            }
        }

        return matrix;
    }
}
