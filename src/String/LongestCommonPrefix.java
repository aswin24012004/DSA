package String;

public class LongestCommonPrefix {

    static String solution(String[] a) {
        int n = a.length;
        if(n==0) return "";
        String prefix = a[0];
        for (int i = 1; i < n; i++) {
            while (a[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length()-1);
            }
        }
        return prefix;
    }
    public static void main(String[] args) {
//        String[] arr = {"flower", "flow", "flight"};
        String[] arr = {"flower", "", "flight"};
        System.out.println(solution(arr));
    }
}
