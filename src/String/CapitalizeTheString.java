package String;

public class CapitalizeTheString {
    public static void main(String[] args) {
        String str = "capiTalIze tHe titLe TO";
        String s = solution(str);
        System.out.println(s);
    }

    public static String solution(String s) {
        char[] ch = s.toCharArray();
        int length = ch.length;

        for (int i = 0; i < length; i++) {
            int firstIndex = i;

            while (i < length && ch[i]!=' ') {
                ch[i] = Character.toLowerCase(ch[i]);
                i++;
            }

                if(i - firstIndex > 2) {
                    ch[firstIndex] = Character.toUpperCase(ch[firstIndex]);
                }

        }

        return String.valueOf(ch);
    }
}
