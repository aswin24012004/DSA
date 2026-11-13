package recursion;

public class ArrayProblems {
    public static void main(String[] args) {
    	int[] nums = {1,2,3,4,15,6,7};
    	System.out.println(arryIsSorted(nums));
    }
    
    static boolean arryIsSorted(int[] a) {
    	return helper(a,0);
    }
    
    static boolean helper(int[] a, int i) {
    	if(i==a.length-1 ) {
    		return true;
    	}
    	return  a[i]<a[i+1] && helper(a, i+1);
    }
    
}
