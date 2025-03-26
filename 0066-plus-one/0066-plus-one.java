class Solution {
    public int[] plusOne(int[] digits) {
        boolean isNine = true;
        for(int x=0;x<digits.length;x++){
            if(digits[x]!=9){
                isNine = false;
            }
        }
        int ar[] = new int[digits.length+1];
        if(isNine){
            ar[0] = 1;
            for(int x=1;x<ar.length;x++){
                ar[x] = 0;
            }
        }else{
            if(digits[digits.length-1]==9){
                int x=digits.length-1;
                while(digits[x]==9){
                    digits[x]=0;
                    x--;
                }
                digits[x]+=1;
            }else{
                digits[digits.length-1]+=1;
            }
        }
        if(isNine){
            return ar;
        }else{
            return digits;
        }
    }
}