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
