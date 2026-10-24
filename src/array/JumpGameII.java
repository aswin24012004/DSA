package Arrays;

public class JumpGameII {
    public static void main(String[] args) {
//        int[] arr = {2,3,1,1,4};
        int[] arr = {2,1};
        // output -> 2
        System.out.println(jumpToGame(arr));
    }

    static int jumpToGame(int[] arr) {
        int jump = 0;
        int n = arr.length-1;
        int current = 0;
        int longest = 0;

        for (int i = 0; i < n; i++) {
            longest = Math.max( longest, arr[i] + i);
            if ( i == current){
                jump++;
                current = longest;
            }
        }
        return jump;
    }
}
