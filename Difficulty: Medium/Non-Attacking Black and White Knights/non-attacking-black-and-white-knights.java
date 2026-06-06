class Solution {
    int dx[] = {2,2,-2,-2,1,1,-1,-1};
    int dy[] = {1,-1,1,-1,2,-2,2,-2};
    public int numOfWays(int n, int m) {
        // code here
        
      int ans = 0;
        for(int i=0; i < n; i++){
            for(int j=0; j<m; j++){
                int k = 1;
                for(int x = 0; x < 8; x++){
                    int nx = i + dx[x] , ny = j + dy[x];
                    if(nx >= 0 && ny >= 0 &&
                        nx < n &&  ny < m)  k++;
                }
                ans = ans + n * m - k;
            }
        }         
        return ans;
    }
};