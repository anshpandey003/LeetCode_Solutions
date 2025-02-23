class Solution {
    public List<String> letterCasePermutation(String s) {
        List<String> output = new ArrayList<>();
        perm(s.toCharArray(),0,output);
        return output;
        
    }

    public static void perm(char[] arr, int i, List<String> output)
    {

        if(i==arr.length)
        {
            output.add(new String (arr));
            return ;
        }
        if(Character.isLetter(arr[i]))
        {
            arr[i] = Character.toLowerCase(arr[i]);
            perm(arr,i+1,output);
            arr[i] = Character.toUpperCase(arr[i]);
            perm(arr,i+1,output);
        }

        else
        {
             perm(arr,i+1,output);
        }
    }
}