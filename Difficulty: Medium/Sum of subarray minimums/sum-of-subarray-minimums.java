class Solution {
    public int sumSubMins(int[] arr) {
        // code here
        
        int n = arr.length;
        long sum = 0;

        Stack<Integer> st = new Stack<>();
        int[] left = new int[n];
        int[] right = new int[n];

        for(int i = 0; i < n; i++) {
            while(!st.isEmpty() && arr[st.peek()] > arr[i]) {
                st.pop();
            }

            if(st.isEmpty())
                left[i] = i + 1;
            else
                left[i] = i - st.peek();

            st.push(i);
        }

        st.clear();

        for(int i = n - 1; i >= 0; i--) {
            while(!st.isEmpty() && arr[st.peek()] >= arr[i]) {
                st.pop();
            }

            if(st.isEmpty())
                right[i] = n - i;
            else
                right[i] = st.peek() - i;

            st.push(i);
        }

        for(int i = 0; i < n; i++) {
            sum += (long)arr[i] * left[i] * right[i];
        }

        return (int)sum;
    }
    
}





        // int r=1;
        // int l=0;
        // int len=arr.length;
        // int min=Integer.MAX_VALUE;
        
        // int sum=0;
        // for(int i=0;i<len;i++)
        // {
        //     sum+=arr[i];
        // }
        // while(r<len)
        // {
        //     if(arr[l]<arr[r])
        //     {
        //         min=Math.min(min,arr[l]);
        //         sum+=min;
        //     }
        //     else
        //     {
        //         min=Math.min(min,arr[r]);
        //         sum+=min;
        //     }
        //     r++;
        //     if(r==len)
        //     {
        //         l++;
        //         r=l+1;
        //         min=Integer.MAX_VALUE;
        //     }
        // }
        // return sum;
