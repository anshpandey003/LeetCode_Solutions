class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int x = 0; x < nums.length; x++)
        {
            if(hm.containsKey(nums[x]))
            {
                hm.put(nums[x],hm.get(nums[x])+1);
                //[1-1+1]
            }
            else
            {
                hm.put(nums[x],1);
            }
        }
        for (Map.Entry<Integer,Integer> mapElement : hm.entrySet()) {
            int key = mapElement.getKey();
 
            // Adding some bonus marks to all the students
            int value = mapElement.getValue();
            if(value==1){
                return key;
            }
        }
        return 0;
    }
}