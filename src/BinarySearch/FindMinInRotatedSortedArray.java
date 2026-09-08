package binarysearch;

public class FindMinInRotatedSortedArray {
    public static int solution(int[] a) {
        int left = 0;
        int right = a.length-1;

        while (left < right) {
            int mid = left + (right-left) / 2;

            if (a[mid] > a[right]) {
                left = mid+1;
            } else {
                right = mid;
            }
        }
        return a[left];
    }
    public static void main(String[] args) {
        int[]  nums= {4,5,6,7,0,1,2};
//        7 > 2
//        int[]  nums= {5,1,3};

        System.out.println(solution(nums));
    }
}
