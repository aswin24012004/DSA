package mustsolve.array;

public class ArrayIsSorted {
    static void main() {
        int[] a = {1,2,3,4,5,6,7};
        System.out.println(sortedOrNot(a));
    }

    static boolean sortedOrNot(int[] nums) {
        return nums[0]<nums[nums.length-1];
    }
}
