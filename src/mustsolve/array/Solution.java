package mustsolve.array;

public class Solution {
    static void main() {
        System.out.println("Must Solve the Problems");
        int[] a = {1,2,3,4};
        System.out.println(secondLargest(a));
    }
    
    static int[] twosum(int[] nums, int target) {
        int n = nums.length;
        if (n == 0) return new int[]{-1,-1};
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.println();
            }
        }
        return new int[]{-1,-1};
    }

    static int secondLargest(int[] nums) {
        int max = nums[0];
        int min = nums[0];
        for (int i=1;i<nums.length;i++) {
            if (nums[i] > max) {
                min = max;
                max = nums[i];
            } else if (nums[i] > min && nums[i] < max) {
                min = nums[i];
            }
        }
        return min;
    }
    static int largest(int[] nums) {
        int max = 0;
        int cmax = nums[0];
        for (int i=1;i<nums.length;i++) {
            max = Math.max(nums[i], max);
        }
        return max;
    }

}
