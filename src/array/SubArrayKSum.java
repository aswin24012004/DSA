package Arrays;

import java.util.HashMap;

public class SubArrayKSum {

    public static void main(String[] args) {
        int[] a = {1,1,1,1};
//        int[] a = {1,2,3,4,5,6,7,8};
        int sum = 2;

        System.out.println(solution(a, sum));;
    }

    /*  sub array sum formula is sum-(sum-k)=k  */
    static int solution(int[] a, int k) {
        int count = 0;
        int prefixsum=0;
        int n = a.length;
        if(n==0) return 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,1);

        for(int i=0;i<n;i++) {
            prefixsum += a[i];
            int diff = prefixsum-k;
            if(map.containsKey(diff)) {
                count += map.get(diff);
            }
            map.put(prefixsum , map.getOrDefault(prefixsum,0) +1);
        }
        return count;
    }
}
