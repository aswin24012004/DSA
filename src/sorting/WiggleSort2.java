package sorting;
import java.util.*;
public class WiggleSort {
    public static int[] solution(int[] a) {
        Arrays.sort(a);
        int length = a.length-1;
        int[] result = new int[length+1];
        int count = 0;
        int mid = length/2;

        while (mid >=0 && ((a.length-1)/2)<length) {
            if(count%2 == 0) result[count++] = a[mid--];
            else result[count++] = a[length--];
        }

        for (int i = 0; i < length; i++) {
            a[i] = result[i];
        }
        return a;
    }

    public static void main(String[] args) {
        int[] array = {1, 5, 1, 1, 6, 4};
        int[] answer = solution(array);

        for (int i: answer) {
            System.out.print(i+" ");
        }
    }
}
