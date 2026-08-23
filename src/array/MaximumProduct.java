package Arrays;

public class MaximumProduct {

        public static int maxProduct(int[] a) {
            int max = a[0];
            int min = a[0];
            int ans = a[0];
            int n  = a.length;
            for(int i=1;i<n;i++) {
                int x = a[i];

                if(x<0) {
                    int temp = max;
                    max = min;
                    min = temp;
                }

                max = Math.max(x, max*x);
                min = Math.min(x, min*x);

                ans = Math.max(ans, max);
            }


            return ans;
        }

    public static void main(String[] args) {
//        int[] nums = {2,3};
        int[] nums = {2,3,-2,4};

        System.out.println(maxProduct(nums));
    }
}
