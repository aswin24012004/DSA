package String;

public class ValidPalindrome {


    public static boolean isPalindrome(String s) {
        char[] ch = s.toCharArray();
        StringBuilder sb = new StringBuilder();

        for(char i: ch) {
            if(Character.isLetter(i) || Character.isDigit(i)){
                sb.append(Character.toLowerCase(i));
            }
        }
        String ans = sb.toString();
        int i = 0, j = ans.length()-1;
        while(i <= j) {
            if(ans.charAt(i) != ans.charAt(j)) return false;
            i++;
            j--;
        }

        return true;
    }
    static boolean solution(String s) {

        StringBuilder sb = new StringBuilder();
        char[] ch = s.toCharArray();
        for (char c : ch) {
            if(Character.isLetter(c) || Character.isDigit(c))
                sb.append(Character.toLowerCase(c));
        }

        String ans = sb.toString();
        System.out.println("String -> "+ans);
        String rev = reverseString(ans);
        System.out.println("String -> "+rev);
        return ans.equals(rev);
    }
    private static String reverseString(String s) {
        char[] ch = s.toCharArray();
        int start = 0;
        int end = ch.length-1;
        while (start <= end) {
            if(ch[start] != ch[end])
                return null;
            start++;
            end--;
        }
        return String.valueOf(ch);
    }
    public static void main(String[] args) {

//        String string = "A man, a place, a a ecal; Panama";
//        String string = "ala, ";
        String string = "rac  a car";
        System.out.println(isPalindrome(string));
        System.out.println(solution(string));
    }
}
