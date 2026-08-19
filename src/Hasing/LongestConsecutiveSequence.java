package Hasing;


import java.util.HashSet;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        int[] nums = {100,4,200,1,3,2};
//        int[] nums = {0,3,7,2,5,8,4,6,0,1};
        System.out.println(solution(nums));
    }

    static int solution(int[] nums) {
        int longest=0;
        HashSet <Integer> set = new HashSet<>();
        for (int i: nums) set.add(i);

        for (int i:set) {
            int currentCount = 0;
            if(!set.contains(i-1)) {
                int j = i;
                while (set.contains(j)) {
                    j++;
                    currentCount++;
                }
                longest = Math.max(longest,currentCount);

            }
        }
        return longest;
    }
}
