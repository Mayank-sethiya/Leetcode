class Solution {
    public int titleToNumber(String columnTitle) {
        int value=0,result=0;
        for(int i=0;i<columnTitle.length();i++)
        {
          value=columnTitle.charAt(i)-64;
          result=result*26+value;
        }
        return result;

    }
}
