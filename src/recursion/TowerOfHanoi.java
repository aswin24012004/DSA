class Solution {
    public int towerOfHanoi(int n, int from, int to, int mid) {
        // code here
         if(n==0) return 0;
         
         int moves = 0;
         
         moves += towerOfHanoi(n-1, from, mid, to);
         
         moves++;
         
         moves += towerOfHanoi(n-1, mid, to, from);
         
         return moves;
    }
}
