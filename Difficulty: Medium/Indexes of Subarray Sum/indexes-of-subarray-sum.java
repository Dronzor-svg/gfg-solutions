class Solution {
    static ArrayList<Integer> subarraySum(int[] arr, int target) {
        ArrayList<Integer> res = new ArrayList<>();

        int left = 0;
        int sum = 0;

        for (int right = 0; right < arr.length; right++) {
            sum += arr[right];

        
            while (sum > target && left <= right) {
                sum -= arr[left];
                left++;
            }

            
            if (sum == target) {
                
                res.add(left + 1);
                res.add(right + 1);
                return res;
            }
        }

  
        res.add(-1);
        return res;
    }
}
