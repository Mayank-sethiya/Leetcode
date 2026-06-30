class Solution {
    public int numberOfSubstrings(String s) {
        int countA=-1,countB=-1,countC=-1;
        int len=s.length(),sum=0;
        for(int i=0;i<len;i++){
            if(s.charAt(i)=='a')
            {
                countA=i;
            }
            else if(s.charAt(i)=='b'){
                countB=i;
            }
            else if(s.charAt(i)=='c'){
                countC=i;
                }
            if(countA!=-1 && countB!=-1 && countC!=-1){
             sum+=1+Math.min(countA,Math.min(countB,countC));
            
            }
            
        }
        return sum;

        
    }
}
