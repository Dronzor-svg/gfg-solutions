class Solution {
    public int totalElements(int[] arr) {
        // code here
        int n = arr.length;
        int i = 0;
        int j = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        int maxLen = Integer.MIN_VALUE;
        
        while(j < n){
            map.put(arr[j] , map.getOrDefault(arr[j] , 0) + 1);
            while(map.size() > 2){
                map.put(arr[i] , map.getOrDefault(arr[i] , 0) - 1);
                if(map.get(arr[i]) <= 0){
                    map.remove(arr[i]);
                }
                i++;
            }
            maxLen = Math.max(maxLen , (j - i + 1));
            j++;
        }
        return maxLen;
    
    
    }
}