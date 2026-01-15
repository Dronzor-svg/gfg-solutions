class Solution {
    public int minCandy(int ratings[]) {
        // Brute
        // int n=arr.length;
        // int[] left=new int[arr.length];
        // int[] right=new int[arr.length];
        
        // left[0]=1;
        // right[n-1]=1;
        // for(int i=1;i<n;i++)
        // {
        //     if(arr[i]>arr[i-1])
        //     {
        //         left[i]=left[i-1]+1;
        //     }
        //     else
        //     {
        //         left[i]=1;
        //     }
        // }
        // for(int i=n-2;i>=0;i--)
        // {
        //     if(arr[i]>arr[i+1])
        //     {
        //         right[i]=right[i+1]+1;
        //     }
        //     else
        //     {
        //         right[i]=1;
        //     }
        // }
        // int sum=0;
        // for(int i=0;i<n;i++)
        // {
        //     sum+=Math.max(left[i],right[i]);
        // }
        // return sum;
        
        
        //Optimal
        
        //(slope approach)
        int n=ratings.length;
        int i=1;
        int sum=1;
        while(i<n)
        {
            if(ratings[i]==ratings[i-1])
            {
                sum+=1;
                i++;
                continue;
            }
        
        int peak=1;
        while(i<n && ratings[i]>ratings[i-1])
        {
            peak+=1;
            sum+=peak;
            i++;
        }
        int down=1;
        while(i<n && ratings[i]<ratings[i-1])
        {
            sum+=down;
            down+=1;
            i++;
        }
        if(down>peak)
        {
            sum+=down-peak;
        }
        }
        return sum;
        
    }
}
