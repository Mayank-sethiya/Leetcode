class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g); // children
        Arrays.sort(s); // cookies
        int i = g.length-1;
        int j = s.length-1;
        int count = 0;
        while(i >= 0 && j >= 0){
            if(s[j] >= g[i]) {
                count++;
                i--;
                j--;
            } else {
                i--;
            }
        }
        return count;

    }
}
