class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Character> st = new Stack<>();
        int [] res = new int[nums1.length];
        for(int i=0; i<nums1.length; i++){
            int j=0;
            for(; j<nums2.length;j++)
            {
                if(nums1[i]==nums2[j])
                {
                    break;
                }
            }

            for(; j<nums2.length; j++)
            {
                if(nums1[i]<nums2[j])
                {
                    res[i]=nums2[j];
                    break;
                }

            }

            if(res[i]==0)
            {
                res[i]=-1;
            }
            

        }

        return res;
    }
}