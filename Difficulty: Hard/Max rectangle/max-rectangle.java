class Solution {
    static int maxArea(int mat[][]) {
        // code here
        int n=mat[0].length;
        int m=mat.length;
        int maxArea=0;
        int[][] preSum=new int[m][n];
        for(int j=0;j<n;j++)
        {
            int sum=0;
            for(int i=0;i<m;i++)
            {
                sum+=mat[i][j];
                if(mat[i][j]==0) sum=0;
                preSum[i][j]=sum;
            }
        }
        for(int i=0;i<m;i++)
        {
            maxArea=Math.max(maxArea,lHist(preSum[i]));
        }
        return maxArea;
    }
    static int lHist(int[] heights)
    {
        Stack<Integer> st=new Stack<>();
        int nse=0;
        int pse=0;
        int element=0;
        int maxArea=0;
        for(int i=0;i<heights.length;i++)
        {
            while(!st.isEmpty() && heights[st.peek()]>heights[i])
            {
                element=st.peek();
                st.pop();
                nse=i;
                pse=st.isEmpty() ? -1 : st.peek();
                maxArea=Math.max(maxArea,heights[element]*(nse-pse-1));
                
            }
            st.push(i);
        }
        while(!st.isEmpty())
        {
            nse=heights.length;
            element=st.peek();
            st.pop();
            pse=st.isEmpty() ? -1 : st.peek();
            maxArea=Math.max(maxArea,heights[element]*(nse-pse-1));
        }
        
        return maxArea;
        
    }
}