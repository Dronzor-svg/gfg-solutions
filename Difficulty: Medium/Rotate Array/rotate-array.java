// User function Template for Java

class Solution {
    // Function to rotate an array by d elements in counter-clockwise direction.
    static void rotateArr(int arr[], int d) {
        // add your code here 
        d=d%arr.length;
        swap(arr,0,d-1);
        swap(arr,d,arr.length-1);
        swap(arr,0,arr.length-1);
        
    }
    static void swap(int[] arr,int left,int right)
    {
        while(left<right)
        {
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
    }
}