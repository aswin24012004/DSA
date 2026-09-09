package binarysearch;

public class SqrtOfN {
    public  static int solution(int squareValue) {
        int n = squareValue;

        int left = 0;
        int right = n;
        int answer = 1;
        while (left<right) {
            int mid = left + (right-left)/2;

            if (mid > squareValue/mid){
                right = mid;
            }
            else {
                answer = mid;
                left = mid+1;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int n = 25;
        System.out.println(solution(n));
    }
}
