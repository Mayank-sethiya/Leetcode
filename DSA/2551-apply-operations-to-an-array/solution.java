class Solution {
    public int[] applyOperations(int[] arr) {
        int i=0;
        int n=arr.length;
        for(int j=0;j<n-1;j++)
        {
            if(arr[j]==arr[j+1])
            {
                arr[j]*=2;
                arr[j+1]=0;
            }
        }
        for(int k=0;k<n;k++)
        {
            if(arr[k]!=0)
            {
                arr[i]=arr[k];
                i++;
            }
        }
        while(i<n)
        {
            arr[i]=0;
            i++;
        }

        return arr;
    }
}
