import java.util.ArrayList;
class Solution {
    public int helper(List<Integer> friends,int k,int ind)
    {
        if(friends.size()==1)
        {
            return friends.get(0);
        }
        ind=(ind +(k-1))%friends.size();
        friends.remove(ind);
        return helper(friends,k,ind);
    }
    public int findTheWinner(int n, int k) {
    List<Integer> friends=new ArrayList<>();
    for(int i=1;i<=n;i++)
    {
        friends.add(i);
    }
    return helper(friends,k,0);
        
    }
}
