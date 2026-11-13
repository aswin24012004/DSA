package recursion;

public class LinearSearch {
    public static void main(String[] args) {
    	int[] nums = {1,2,3,4,5,6,7};
    	int target = 5;
      
    	System.out.println(linearSearch(nums, target));
    }
  
    static int linearSearch(int[] a, int t) {
    	return solution(a,t,0);
    }
    
    static int solution(int[] a, int t, int i) {
    	if(i==a.length-1) return -1;
    	if(a[i] == t) return i;
    	return solution(a, t, i+1);
    }
}
