class Solution {
    public int kokoEat(int[] arr, int k) {
        int low = 1;
        int high = 0;

        
        for (int x : arr) {
            high = Math.max(high, x);
        }

        int ans = high;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            int totalhrs = func(arr, mid);

            if (totalhrs <= k) {
                ans = mid;        
                high = mid - 1;   
            } else {
                low = mid + 1;    
            }
        }
        return ans;
    }

    int func(int[] arr, int hourly) {
        int totalhrs = 0;
        for (int i = 0; i < arr.length; i++) {
  
            totalhrs += (arr[i] + hourly - 1) / hourly;
        }
        return totalhrs;
    }
}
