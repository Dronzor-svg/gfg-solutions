class Solution {
    int maxPeopleDefeated(int p) {
        // code here
        int cnt=0;
        int sum=1;
        for(int i=2;i<=p;i++)
        {
            if(sum<=p)
            {
                cnt++;
            }
            else break;
            
            sum=sum+(i*i);
        }
        return cnt;
    }
};