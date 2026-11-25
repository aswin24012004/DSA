class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        backtrack(res,nums,0, target, new ArrayList<Integer>());
        return res;
    }

    private void backtrack(List<List<Integer>> res, int[] nums, int pos, int target, List<Integer> temp) {
      if(target < 0) return;

      if(target == 0) res.add(new ArrayList<>(temp));

      for(int i=pos; i<nums.length;i++) {
        if(nums[i] > target) return;
        temp.add(nums[i]);
        backtrack(res, nums, i,target-nums[i], temp);
        temp.remove(temp.size()-1);
      }
    }
}
