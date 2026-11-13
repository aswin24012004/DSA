package recursion;

import java.util.ArrayList;

public class Find {

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4, 4, 5, 6, 7};
        int target = 0;

        System.out.println(find1stOcc(nums, target));
        System.out.println(findLastOcc(nums, target));
        System.out.println(findall(nums, target, new ArrayList<Integer>()));
    }

    // Find all occurrences of target
    private static ArrayList<Integer> findall(
            int[] a, int t, ArrayList<Integer> list) {

        return helper(a, t, list, 0);
    }

    private static ArrayList<Integer> helper(
            int[] a, int t, ArrayList<Integer> list, int i) {

        if (i == a.length - 1) {
            return list;
        }

        if (a[i] == t) {
            list.add(i);
        }

        return helper(a, t, list, i + 1);
    }

    // Find last occurrence of target
    private static int findLastOcc(int[] a, int t) {
        return solution(a, t, a.length - 1);
    }

    private static int solution(int[] a, int t, int i) {

        if (i == 0) {
            return -1;
        }

        if (a[i] == t) {
            return i;
        }

        return solution(a, t, i - 1);
    }

    // Find first occurrence of target
    private static int find1stOcc(int[] a, int t) {
        return helper(a, t, 0);
    }

    private static int helper(int[] a, int t, int i) {

        if (i == a.length - 1) {
            return -1;
        }

        if (a[i] == t) {
            return i;
        }

        return helper(a, t, i + 1);
    }
}
