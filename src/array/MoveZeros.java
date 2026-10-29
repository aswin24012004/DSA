class Solution {
    public void moveZeroes(int[] nums) {
        int pos = 0;
        for(int i: nums) {
            if(i != 0) {
                nums[pos++] = i;
            }
        }
        while(pos < nums.length) {
            nums[pos++] = 0;
        }
        // return nums;
    }
}
