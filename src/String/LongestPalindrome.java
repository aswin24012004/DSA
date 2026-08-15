package String;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class LongestPalindrome {
    static int solution(String s) {

        HashMap<Character, Integer> map = new HashMap<>();
        for(char i: s.toCharArray()) {
                map.put(i, map.getOrDefault(i,0)+1);
        }

        int count = 0;
        Boolean flag = false;
        for (Map.Entry<Character, Integer> entry: map.entrySet()) {
            char key = entry.getKey();
            int val  = entry.getValue();

            if(val%2 == 0) {
                count += val/2;
            }

            else {
                flag = true;
                count += (val-1)/2;
            }
        }
        return flag ? (count*2)+1 : (count*2) ;
    }

    public static void main(String args[]) {
        String s = "abccccdd";
        System.out.println(solution(s));
    }
}
