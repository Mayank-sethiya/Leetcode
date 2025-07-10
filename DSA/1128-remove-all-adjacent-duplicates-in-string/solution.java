class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> stck=new Stack();
        int i=0;
        String sc="";
        while(i<s.length())
        {
            char ch=s.charAt(i);
        if(stck.size()==0) stck.push(ch);
        else if(stck.peek()==s.charAt(i)) stck.pop();
        else stck.push(ch);
        i++;
        }
        while(stck.size()!=0)
        {
        sc=stck.pop()+sc;
        }

        return sc;
        
        
    }
}
