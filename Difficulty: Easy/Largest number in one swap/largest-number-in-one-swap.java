class Solution {
    public String largestSwap(String s) {
        // code here
        char arr[]=s.toCharArray();
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            int maxidx=i;
            for(int j=i+1;j<n;j++)
            {
                if(arr[j]>=arr[maxidx]) maxidx=j;
            }
            if(arr[maxidx]>arr[i])
            {
                char temp=arr[i];
                arr[i]=arr[maxidx];
                arr[maxidx]=temp;
                break;
                
            }
        }
        return new String(arr);
        
    }
}