import java.util.HashMap;

class Solution {
    int longestSubarrayDivK(int[] arr, int k) {
        HashMap<Integer, Integer> mpp = new HashMap<>();

        long sum = 0;  
        int maxLen = 0;

        mpp.put(0, -1);

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            int rem = (int)(sum % k);
            if (rem < 0) rem += k;

            if (mpp.containsKey(rem)) {
                maxLen = Math.max(maxLen, i - mpp.get(rem));
            } else {
                mpp.put(rem, i);
            }
        }
        return maxLen;
    }
}