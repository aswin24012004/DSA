package sorting;

public class SortAnArray {
    public static int[] solution(int[] nums) {
        int n = nums.length;
        mergeSort(nums, 0, n-1);
        return nums;
    }

    private static void mergeSort(int[] nums, int left, int right) {
        if (left < right) {
            int mid = left + (right-left) /2;
            mergeSort(nums ,left, mid);
            mergeSort(nums ,mid+1, right);
            merge(nums , left, right, mid);
        }
    }
    private static void merge(int[] nums, int left, int right, int mid) {
        int n = mid-left+1;
        int m = right-mid;

        int[] leftArray  = new int[n];
        int[] rightArray = new int[m];

        for (int i = 0; i < n; i++) {
            leftArray[i] = nums[left+i];
        }
        for (int i = 0; i < m; i++) {
            rightArray[i] = nums[mid+i+1];
        }
        int i = 0;
        int j = 0;
        int count = left;

        while (i<n && j<m) {
            if(leftArray[i] <= rightArray[j]) {
                nums[count++] = leftArray[i++];
            }

            else {
                nums[count++] = rightArray[j++];
            }
        }

        while (i<n) {
            nums[count++] = leftArray[i++];
        }
        while (j<m) {
            nums[count++] = rightArray[j++];
        }
    }

    public static void main(String[] args) {
        int[] array = {5, 2, 3, 1};
        int[] answer = solution(array);

        for (int i: answer) {
            System.out.print(i+" ");
        }
    }

    }
