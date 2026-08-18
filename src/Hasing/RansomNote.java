package Hasing;

public class RansomNote {
    public static boolean solution(String ransomNote, String magazine) {
        int[] hash = new int[128];

        for (char i: magazine.toCharArray()){
            hash[i-'0']++;
        }

        for (char i: ransomNote.toCharArray()){
            hash[i-'0']--;
        }
        for(int i:hash) {
            if (i<0) {
                return false;
            }
        }
        return true;
    }

    public boolean canConstruct(String ransomNote, String magazine) {

        int[] count = new int[26];

        // Count characters available in magazine
        for (int i = 0; i < magazine.length(); i++) {
            count[magazine.charAt(i) - 'a']++;
        }

        // Use characters for ransomNote
        for (int i = 0; i < ransomNote.length(); i++) {

            int index = ransomNote.charAt(i) - 'a';

            if (count[index] == 0) {
                return false;
            }

            count[index]--;
        }

        return true;
    }

    public static void main(String[] args) {
        String ransomNote = "aa";
        String magazine = "baa";
        System.out.println(solution(ransomNote, magazine));
    }
}
