class TwoSum {
    public int[] solution(int[] nums, int target) {
        HashMap<Integer,Integer>list=new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
            int need = target-nums[i];
            if(list.containsKey(need)){
                return new int[]{list.get(need), i}; 
            }
            list.put(nums[i],i);
        }
        return new int[]{};
    }
  public static void main (String args[]) {
    int[] arr ={2,7,11,15};
    int target = 9;
    int[] answer = solution(arr, target);
    for(int i: answer) {
      System.out.print(i+" ");
  }
}
