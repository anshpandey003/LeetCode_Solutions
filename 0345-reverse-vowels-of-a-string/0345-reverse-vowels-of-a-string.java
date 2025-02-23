class Solution {
    public String reverseVowels(String s) {
        String v ="";
     char[]a=s.toCharArray();
     String ans="";
     for(char c : a){
        if(c=='a'||c=='A'||c=='e'||c=='E'||c=='i'||c=='I'||c=='o'||c=='O'||c=='u'||c=='U'){
            v=c+v;
        }
     }
     int m=0;
     for(char c : a){
if(c=='a'||c=='A'||c=='e'||c=='E'||c=='i'||c=='I'||c=='o'||c=='O'||c=='u'||c=='U'){
    ans+=v.charAt(m);
    m++;
}
else{
    ans+=c;
}
     }
     return ans;
    }
}