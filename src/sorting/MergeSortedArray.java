package sorting;

public class MergeSortedArray {
    private static  int[] solution(int[] a, int[] b, int n, int m) {
        int left = 0;
        int right = 0;
        int index = 0;
        int[] result = new int[n+m];

        while (left<n && right<m) {
            if(a[left] < b[right]) {
                result[index++] = a[left++];
            }
            else {
                result[index++] = b[right++];
            }
        }

        while (left < n) result[index++] = a[left++];
        while (right < m) result[index++] = b[right++];

        for (int i = 0; i < n+m; i++) {
            a[i] = result[i];
        }
        return a;

    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        int n = 3;
        int m = nums2.length;
        int[] answer = solution(nums1,nums2,n,m);

        for (int i: answer) {
            System.out.print(i+" ");
        }
    }
}
