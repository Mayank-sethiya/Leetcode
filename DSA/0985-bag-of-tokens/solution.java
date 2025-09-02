class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        int max=0;
        int s=0;
        int n=tokens.length,i=0,j=n-1;
        Arrays.sort(tokens);
        while(i<=j)
        {
            if(power>=tokens[i])
            {
             power-=tokens[i];
             s+=1;
             i++;
             max=Math.max(s,max);
            }
            else if(s>=1)
            {
                power+=tokens[j];
                s-=1;
                j--;
            }
            else
            {
                return max;
            }
        }
       return max; 
    }
}
