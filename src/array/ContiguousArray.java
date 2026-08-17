package Arrays;

import java.util.HashMap;

public class ContiguousArray {

    public static void main(String[] args) {
        int[] arr = {0,1,0};
        System.out.println(solution(arr));
    }

    static int solution(int[] nums) {
        HashMap<Integer, Integer > map = new HashMap<>();
        int n = nums.length;
        int longest = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += (nums[i]==0) ? -1:1;
            if (sum == 0) {
                longest = i+1;
            } else if ((map.containsKey(sum))) {
                longest = Math.max(longest, i-map.get(sum));
            }
            else {
                map.put(sum, i);
            }
        }
        return longest;
    }
}
