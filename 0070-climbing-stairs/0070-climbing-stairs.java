class Solution {
    public int climbStairs(int n) {
        if(n==1 || n==2)
        {
            return n;   
        }

        int [] w = new int[n];
        for(int i=2; i<n; i++)
        {
            w[0]= 1;
            w[1]=2;
            w[i]=w[i-1]+w[i-2];
        }

        return w[n-1];
        
    }
}