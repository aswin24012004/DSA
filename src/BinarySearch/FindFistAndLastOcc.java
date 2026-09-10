package binarysearch;

public class FindFistAndLastOcc {
    public static void main(String[] args) {
        int[] array = {5,7,7,8,8,10};
        int target = 8;
        int[] answer = solution(array, target);
        for (int i: answer) {
            System.out.print(i+" ");
        }
    }

    public static int[] solution(int[] nums, int target){
        int firstOcc = binarySearch(nums, target);
        if (firstOcc == nums.length || nums[firstOcc] != target);
        return new int[]{firstOcc, binarySearch(nums, target+1)-1};
    }

    private static int binarySearch(int[] nums, int target) {
        int left = 0;
        int right = nums.length;

        while (left < right) {
            int mid = left + (right-left)/2;

            if (nums[mid] < target) {
                left = mid+1;
            } else  {
                right = mid;
            }
        }
        return left;
    }
}
