package binarysearch;

import java.util.Arrays;

public class Search2DMatrix {
    private static int binarySearch(int left, int right, int[] arr, int target) {

        while (left <= right) {
            int mid = left + (right-left)/2;
//            System.out.println(mid);

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                left = mid+1;
            }else {
                right = mid-1;
            }
        }
        return -1;
    }
    public static int[] solution(int[][] matrix, int target) {
        int row = matrix.length-1;
        int col = matrix[0].length-1;

        for (int i = 0; i < row; i++) {
            /*for (int j = 0; j < col; j++) {
                result = binarySearch(i,j, matrix,target);
            }*/

            int result = binarySearch(
                    0,
                    matrix[i].length-1,
                    matrix[i],
                    target
            );

            if ( result != -1) {
                return new int[]{i, result};
            }
        }

        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1,3,5,7},{10,11,16,20},{23,30,34,60}
        };
        int target = 11;

        int[] result = solution(matrix, target);
        System.out.println(result[0]+ " ,"+result[1]);

    }
}
