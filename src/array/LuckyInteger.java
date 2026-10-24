package Arrays;

import javax.swing.*;
import java.util.HashMap;
import java.util.Map;

public class LuckyInteger {
    static void main() {
        int[] arr = {1,2,2,3,3,3};
//        int[] arr = {4,2,2};
//        System.out.println(luckyNuberI(arr));
        System.out.println(luckyNuberII(arr));
    }
    static int luckyNuberI (int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i: nums) {
            map.put(i, map.getOrDefault(i,0)+1);
        }
        int max = 0;
        for(Map.Entry<Integer,Integer>it: map.entrySet()) {
            if (it.getKey() == it.getValue()) {
                max = Math.max(max, it.getKey());
            }
        }
        return  max;
    }
    static int luckyNuberII (int[] nums) {
        int[] frequency = new int[501];
        for (int num: nums) {
            frequency[num]++;
        }
        for (int i = 500; i > 0; i--) {
            if ( i == frequency[i]) {
                return i;
            }
        }
        return  -1;
    }

}
