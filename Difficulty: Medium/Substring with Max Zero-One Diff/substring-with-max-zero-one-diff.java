class Solution {
    int maxSubstring(String s) {
        // code here
        int currSum = 0;
        int maxSum = -1;
        
        for(int i=0; i<s.length();i++) {
            int ch=s.charAt(i)-'0';
            if(ch == 0)
                currSum++;
            
            else 
                currSum--;
            
            
            maxSum = Math.max(currSum,maxSum);
             if(currSum < 0)
            currSum = 0;
        }
        return maxSum;
    }
};