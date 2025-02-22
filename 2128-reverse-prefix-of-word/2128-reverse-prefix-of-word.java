class Solution {
    public String reversePrefix(String word, char ch) {
        Stack<Character> st = new Stack <> ();
        int i =0;
        for(; i<word.length(); i++)
        {
            st.push(word.charAt(i));
            if(word.charAt(i)==ch)
            {
                break;
            }
        }
        String answer = "";
        while(!st.isEmpty())
        {
            
            answer +=st.pop();
        }

        if(i==word.length()){
            return word;
        }

        return answer+ word.substring(i+1);
    }
}