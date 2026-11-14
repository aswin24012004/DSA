package backtrack;

import java.util.ArrayList;
import java.util.List;

public class Permutations {
    static void main() {
        int[] arr = {1, 2, 3};
                System.out.println("Permutations");
        System.out.println(findPermutations(arr));

    }

    static List<List<Integer>> findPermutations(int[] arr) {
        List<List<Integer>> answer = new ArrayList<>();
        backtrack(arr, answer, new boolean[arr.length], new ArrayList<>());
        return answer;
    }

    private static void backtrack(int[] nums, List<List<Integer>> result, boolean[] used, ArrayList<Integer> temp) {
        if (temp.size() == nums.length) {
            result.add(new ArrayList<>(temp));
        }

        for (int i = 0; i < nums.length; i++) {
            if (used[i]) continue;;
            used[i] = true;
            temp.add(nums[i]);
            backtrack(nums, result,used, temp);
            temp.remove(temp.size()-1);
            used[i] = false;

        }
    }

}

