class Solution {
    public void replaceElements(int[] arr) {
        // code here
         int prev= arr[0];
        int n= arr.length;
        int last= arr[n-1];
        arr[0]= arr[0] ^ arr[1];
        if(arr.length==2){
            arr[1]= arr[1] ^ prev;
        }
        else{
            arr[n-1]= arr[n-1] ^ arr[n-2];
        }
        for(int i= 1; i<n-1; i++){
            int new_ele= arr[i];
            if(i==n-2){
                arr[i]= prev ^ last;
                break;
            }
            else{
                arr[i]= prev ^ arr[i+1];
            }
            prev= new_ele;
        }
        
    }
};

