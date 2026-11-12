
package recursion;

public class Print1toN {

    public static void main(String[] args) {

    	
      System.out.println(powerOfNum(2,7)); 
      // 8(2,3)   
      // 32768(2,7)
    }
    
    static int  powerOfNum(int k, int n) {
    	int limit = 0;
    	if(n==0) return 1;
    	if(n==1) return k;
    	return helper(k,n,limit);
    	
    }
    static int  helper(int k, int n, int l) {

    	if(l<n) {
    		return k*helper(k*k, n-1,l+1);
    		}
    	else {
    		return 1;
    	}
    }

}
