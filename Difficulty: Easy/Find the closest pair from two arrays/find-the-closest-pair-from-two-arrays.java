class Solution {
    public static ArrayList<Integer> findClosestPair(int arr1[], int arr2[], int x) {
        // code here
        int ans1=0;
        int ans2=0;
        int diff=Integer.MAX_VALUE;
        int i=0;
        int j=arr2.length-1;
        
        while(i<arr1.length && j>=0){
               
               int d=Math.abs((arr1[i]+arr2[j])-x);
               if(d<diff){
                   diff=d;
                   ans1=arr1[i];
                   ans2=arr2[j];
               }
               if(arr1[i]+arr2[j]>x){
                   j--;
               }
               else if(arr1[i]+arr2[j]<=x){
                   i++;
               }
        }
        
        ArrayList<Integer>ans=new ArrayList<>();
        ans.add(ans1);
        ans.add(ans2);
        
        return ans;
    }
}