class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        if(s.length()%2!=0)
        {
            return false;
        }
        for (int i=0; i<s.length(); i++){
            char c1 = s.charAt(i);
            String c=c1+"";
            if(c.equals("(") || c.equals("{") || c.equals("[")){
                st.push(c1);
            } else if(!(st.isEmpty()) && st.peek() == '(' && c.equals(")")){
                st.pop();
            } else if(!(st.isEmpty()) && st.peek() == '[' && c.equals("]")){
                st.pop();
            } else if(!(st.isEmpty()) && st.peek() == '{' && c.equals("}")){
                st.pop();
            }

            else{
                return false;
            }
        }           
        return st.isEmpty();
    }
}