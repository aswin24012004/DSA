package matrix;

public class RotateImage {
    public static void main(String[] args) {
        int[][] matrix = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        int[][] answerMatrix = solution(matrix);

        for (int i = 0; i <answerMatrix.length; i++) {
            for (int j = 0; j < answerMatrix.length; j++) {
                System.out.print(answerMatrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    static int[][] solution(int[][] matrix) {
        int n = matrix.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                swap(matrix,i,j);
            }
            System.out.println();
        }

        for (int i=0;i<n;i++) {
            reverseArray(matrix[i], 0, n-1);
        }

        return matrix;
    }

    private static void swap(int[][] matrix, int row, int col) {
        int temp = matrix[row][col];
        matrix[row][col] = matrix[col][row];
        matrix[col][row] = temp;
    }

    private static void reverseArray(int[] arr, int start, int end) {
        while (start <= end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
