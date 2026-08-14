package String;

public class ReverseLetters {
    static String solution(String s) {
        char[] ch = s.toCharArray();
        int start = 0, end = ch.length-1;
        while (start < end) {
            if(Character.isLetter(ch[start])) {
                if( Character.isLetter(ch[end])) {
                    char tmp = ch[start];
                    ch[start] = ch[end];
                    ch[end] = tmp;
                    start++;
                    end--;
                }
                else {
                    end --;
                }
            }
            else {
                start++;
            }
        }

        String string = new String(ch);;
           return string;
    }

    public static void main(String[] args ) {
        String s = "He-lo";
        System.out.println(solution(s));
    }
}
