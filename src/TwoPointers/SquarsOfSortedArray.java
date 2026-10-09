class Solution {
    public int[] sortedSquares(int[] nums) {
        int l=0, r=nums.length-1;
        int[] res = new int[r+1];
        for(int i=r;i>=0;i--){
            if(Math.abs(nums[l])> Math.abs(nums[r])){
                res[i] = Math.abs(nums[l]) * Math.abs(nums[l]);
                l++;
            }
            else {
                 res[i] = Math.abs(nums[r]) * Math.abs(nums[r]);
                 r--;
            }
        }
        return res;
    }
}
