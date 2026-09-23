package sorting;

public class CyclicSort {
    public static void main(String[] args) {
        int[] array = {4,3,5,1,2};
        int[] answer = solution(array);
        for (int i: answer){
            System.out.print(i+" ");
        }
    }

    public static int[] solution(int[] nums) {
        int n = nums.length;
        int i=0;
        while (i<n) {
            int correctPosition = nums[i]-1;
            if(nums[i] != nums[correctPosition]) {
                int temp = nums[i];
                nums[i] = nums[correctPosition];
                nums[correctPosition] = temp;
            }
            else {
                i++;
            }
        }
        return nums;
    }
}
