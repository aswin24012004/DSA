package Arrays;
import java.util.Arrays;
public class ProductOfArrayItself {
    public static int[] solution(int[] arr) {
        int n = arr.length;
        int[] answer = new int[n];
        int[] leftProduct = new int[n];
        int[] rightProduct = new int[n];
        
        int product =1;

        for (int i = 0; i < n; i++) {
            product *= arr[i];
            leftProduct[i] = product;
        }
        product = 1;
        for (int i = n-1; i >= 0; i--) {
            product *= arr[i];
            rightProduct[i] = product;
        }

        answer[0]   = rightProduct[1];
        answer[n-1] = leftProduct[n-2];
        for (int i = 1; i < n-1; i++) {
            answer[i] = leftProduct[i-1] * rightProduct[i+1];
        }
        return  answer;
    }

    public static void main(String[] args) {

        int[] a = {1, 2, 3, 4};
        int[] result = solution(a);
        System.out.println(Arrays.toString(result));
    }
}
