package array;

public class ReverseArray {
    public static void reverseAnArray(int[] a){
        int left = 0;
        int right = a.length-1;

        while (left < right) {
            int temp = a[left];
            a[left] = a[right];
            a[right] = temp;

            left++;
            right--;
        }
    }
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,6,7,8,9,0};
        reverseAnArray(arr);
        for (int i: arr) {
            System.out.print(i+" ");
        }
    }
}
