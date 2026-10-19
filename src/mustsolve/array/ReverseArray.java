package mustsolve.array;

public class ReverseArray {
    static void main() {
        int[] a = {1,2,3,4,5,6,7};
        reverse(a);
    }
    static void reverse(int[] nums) {
        int left = 0;
        int right = nums.length-1;

        while (left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }

        for (int i: nums) {
            System.out.print(i+" ");
        }
    }
}
