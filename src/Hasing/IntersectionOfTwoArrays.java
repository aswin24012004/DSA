package Hasing;

import java.util.HashSet;
import java.util.Set;

public class IntersectionOfTwoArrays {
    static int[] solution(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> result = new HashSet<>();

        for (int i:nums1) {
            set.add(i);
        }
        for (int i:nums2) {
            if(set.contains(i)) {
                result.add(i);
            }
        }

        int[] resultArray = new int[set.size()-1];
        int index = 0;
        for (int i: result) {
            resultArray[index++] = i;
        }
        return resultArray;
    }

    public static void main(String[] args) {
        int[] a = {4,9,5};
        int[] b = {9,4,7,5};
        int[] ans = solution(a,b);
        for(int i: ans) {
            System.out.print(i+" ");
        }
    }
}
