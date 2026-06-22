class Solution {
    public int maxArea(List<Integer> height) {
        // code here
        int l=0;
        int r=height.size()-1;
        int area=Integer.MIN_VALUE;
        while(l<=r)
        {
            if(height.get(l)<height.get(r))
            {
                area=Math.max(area,(r-l-1)*height.get(l));
                l++;
            }
            else if(height.get(l)>height.get(r))
            {
                area=Math.max(area,(r-l-1)*height.get(r));
                r--;
            }
            else 
            {
                area=Math.max(area,(r-l-1)*height.get(r));
                
                r--;
            }
        }
        return area;
    }
}