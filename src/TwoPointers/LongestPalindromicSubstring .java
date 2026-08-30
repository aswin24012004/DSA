package TwoPointers;

public class LongestPalindromicSubstring {
    private static int expand(String str, int left, int right) {

        while (left >= 0 && right < str.length() && str.charAt(left) == str.charAt(right)) {
            left--;
            right++;
        }

        return right - left - 1;
    }

    public static String solution(String str) {
        int start = 0;
        int end = str.length()-1;
        int maxLength = 0;

        for (int i = 0; i < end; i++) {
            int length1 = expand(str, i, i);
            int length2 = expand(str, i, i+1);
            int length  = Math.max(length1, length2);

            if (length > maxLength) {
                start = i - (length-1) / 2;
                maxLength = length;
            }
        }

        return  str.substring(start, start + maxLength);
    }

    public static void main(String[] args) {

//        String s = "babad";
        String s = "bsscmadamd";
        System.out.println(solution(s));
    }
}
