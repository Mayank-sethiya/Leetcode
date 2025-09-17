class Solution {
    public boolean doesAliceWin(String s) {
        for(char a:s.toCharArray())
        {
            if(a=='a'||a=='e'||a=='i'||a=='o'||a=='u')
            {
                return true;
            }
        }
        
           
                return false;
           
        
    }
}
