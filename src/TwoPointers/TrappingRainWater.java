package TwoPointers;

public class TrappingRainWater {
    public static int solution(int[] height) {
        int n = height.length;
        int left = 0;
        int right = n-1;
        int maxLeft = 0;
        int maxRight = 0;
        int result = 0;

        while (left <= right) {
            if (height[left] <= height[right]) {
                if(height[left] >= maxLeft ) {
                    maxLeft = height[left];
                }
                else {
                    result += maxLeft - height[left];
                }
                left++;
            }
            else  {
                if (height[right] >= maxRight) {
                    maxRight = height[right];
                }
                else {
                    result += maxRight - height[right];
                }
                right--;
            }

        }
        return result;
    }

    public static void main(String[] args) {
        int[] array = {0,1,0,2,1,0,1,3,2,1,2,1};
//        int[] array = {4,2,0,3,2,5};
        System.out.println("Trapping Rain water solution is -> "+ solution(array));
    }
}
