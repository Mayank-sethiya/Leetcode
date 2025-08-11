class Solution {
    public boolean hasAllCodes(String s, int k) {
        HashSet<String> hs=new HashSet<>();
        int totalS=(int)Math.pow(2,k);
        int n=s.length();
         String temp="";
        for(int i=0;i<=n-k;i++)
        {
            hs.add(s.substring(i,i+k));
            
        }
        if(hs.size()==totalS)
        {
            return true;
        }
        else
        {
            return false;
        }

        
    }
}
