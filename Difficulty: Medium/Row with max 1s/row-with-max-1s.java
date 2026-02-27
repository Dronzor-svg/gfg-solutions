// User function Template for Java

class Solution {
    public int rowWithMax1s(int arr[][]) {
        // code here
        int max=0;
        int cnt=0;
        int a=-1;
        for(int i=0;i<arr.length;i++)
        {
            cnt=0;
            for(int j=0;j<arr[0].length;j++)
            {
                if(arr[i][j]==1) cnt++;
            }
            if(cnt>max)
            {
                max=cnt;
                a=i;
            }
        }
        return a;
    }
}  