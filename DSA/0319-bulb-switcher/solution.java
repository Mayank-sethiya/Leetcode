class Solution {
    public int bulbSwitch(int n) {
        int on=0,sq=0;
        int i=1;
        while(i<=n)
        {
            sq=(int)Math.sqrt(i);
            if(sq*sq==i)
            {
                on++;
            }


            i++;
        }
       
      return on;  
    }
}
