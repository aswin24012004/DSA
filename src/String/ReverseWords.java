package String;

public class ReverseWords {

    static String solution(String s) {

        StringBuilder sb = new StringBuilder();
        int space=0, length=s.length();
        while (space < length) {

            while (space<length && s.charAt(space) == ' ') space++;
            if(space >= length) break;
            int character = space+1;
            while (character<length && s.charAt(character) != ' ') character++;

            String subSringValue = s.substring(space, character);

            if(sb.isEmpty()) {
                sb.insert(0,subSringValue);
            }

            else {
                sb.insert(0, subSringValue+"*");
            }
            space = character+1;
        }
        return sb.toString();
    }
     public static void main(String[] args) {

//        String string = "the sky is blue";
//        String string = "  hello world  ";
        String string = "the sky           is blue";
        System.out.println(solution(string));
    }
}
