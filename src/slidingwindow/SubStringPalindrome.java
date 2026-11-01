package slidingwindow;

import java.util.HashSet;
import java.util.Set;

public class SubStringPalindrome {
    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(ans(s));
        System.out.println(lengthOfLongestSubstring(s));
    }

    static int ans(String s) {
        Set<Character> set = new HashSet<>();
        int left=0, right=0, max = 0;

        while (right < s.length()-1) {
            if(!set.contains(s.charAt(right))) {
                set.add(s.charAt(right));
                max = Math.max(max, set.size());
                right++;
            } else {
                set.remove(s.charAt(left));
                left++;
            }
        }
        System.out.println(set);
        return max;
    }
    static int lengthOfLongestSubstring(String s) {
        int l=0;
        int r=0;
        int m=0;
        Set<Character>set = new HashSet<>();

        while(r<s.length()) {
            if(!set.contains(s.charAt(r))) {
                set.add(s.charAt(r));
                m = Math.max(m,set.size());
                r++;
            } else {
                set.remove(s.charAt(l));
                l++;
            }

        }
        return m;
    }
}
