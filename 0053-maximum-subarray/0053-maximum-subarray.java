class Solution {
    public int maxSubArray(int[] nums) {
        int MaxSum = Integer.MIN_VALUE;
        int currSum = 0;

        for(int i=0; i<nums.length;i++)
        {
           currSum += nums[i];
           if(currSum < 0)
           {
            if(currSum>MaxSum)
           {
            MaxSum = currSum;
           }
            currSum=0;
            continue;
           }   
           if(currSum>MaxSum)
           {
            MaxSum = currSum;
           }
                   
        }
        return MaxSum;
    }
}