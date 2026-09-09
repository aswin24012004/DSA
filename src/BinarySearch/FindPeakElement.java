package binarysearch;

public class FindPeakElement {
    public static int solution(int[] nums) {
        int left = 0;
        int right = nums.length-1;

        while (left<right) {
            int mid = left + (right-left)/2;

            if (nums[mid] < nums[mid+1]) {
                left = mid+1;
            }
            else {
                right = mid;
            }
        }

        return nums[left];
    }

    public static void main(String[] args) {
        int[] array = {1,2,5,3,6};
        System.out.println(solution(array));
    }
}
