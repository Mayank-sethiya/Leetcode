class Solution {
    public boolean isValid(String s) {
        Stack<Character> st=new Stack<>();
        
        int n=s.length();
        for(int i=0;i<n;i++)
        {
             char a=s.charAt(i);
            if(a=='(' || a=='{' || a=='[')
            {
                st.push(a);
            }
           
            if(a==')'|| a=='}'|| a==']')
            {
                if(st.isEmpty()) return false;
                if(st.peek()=='{' && a=='}' ||
                   st.peek()=='(' && a==')' ||
                   st.peek()=='[' && a==']')
                {
                    st.pop();

                }
                else
                {
                    return false;
                }
            }
                
                

            
        }
       return st.isEmpty();

        
    }
}
