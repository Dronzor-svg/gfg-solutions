class Solution {
    void nextPermutation(int[] arr) {
        int n = arr.length;
        int ind = -1;

        // 1. Find break point
        for(int i = n-2; i >= 0; i--) {
            if(arr[i] < arr[i+1]) {
                ind = i;
                break;
            }
        }

        // 2. If no breakpoint → reverse whole array
        if(ind == -1) {
            reverse(arr, 0, n-1);
            return;  
        }

        // 3. Find next greater element and swap
        for(int i = n-1; i > ind; i--) {
            if(arr[i] > arr[ind]) {
                int temp = arr[i];
                arr[i] = arr[ind];
                arr[ind] = temp;
                break;
            }
        }

        // 4. Reverse right half
        reverse(arr, ind+1, n-1);
    }

    void reverse(int[] arr, int l, int r) {
        while(l < r) {
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
    }
}
