package sorting;

public class FirstMissingPositive {
    public static int solution(int[] arr) {
        int n = arr.length;
        int i=0;
        while(i<n ) {
            int crt = arr[i]-1;
            if(arr[i] > 0 && arr[i] <= n && arr[crt] != arr[i]){
                swap(arr[crt], arr[i]);
            }
            else {
                i++;
            }
        }
        for (int j = 0; j < n; j++) {
            if (arr[j] != j+1) return j+1;
        }
        return arr.length+1;
    }

    private static void swap(int i, int j) {
        int temp = i;
        i = j;
        j = temp;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,0};
        int a = solution(nums);
        System.out.println(a);
//        for (int i:a) {
//            System.out.print(i+" ");
//        }
    }
}
