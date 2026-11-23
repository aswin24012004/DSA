class Solution {
    public int findDuplicate(int[] a) {
        int s = a[0];
        int f = a[0];

        while(true) {

          s = a[s];
          f = a[a[f]];

          if(s == f) {
            break;
          }
        }

        int ss = a[0];

        while (s != ss) {
          s = a[s];
          ss = a[ss];
        }

        return s;
    }
}


Example 1:

Input: nums = [1,3,4,2,2]
Output: 2
Example 2:

Input: nums = [3,1,3,4,2]
Output: 3
Example 3:

Input: nums = [3,3,3,3,3]
Output: 3
