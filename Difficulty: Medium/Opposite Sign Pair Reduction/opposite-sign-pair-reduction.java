class Solution {
    public ArrayList<Integer> reducePairs(int[] arr) {
        Stack<Integer> st = new Stack<>();

        for (int num : arr) {
            boolean alive = true;

            while (!st.isEmpty() && st.peek() * num < 0) { 
                if (Math.abs(st.peek()) == Math.abs(num)) {
                    st.pop();         
                    alive = false;
                    break;
                }
                else if (Math.abs(st.peek()) > Math.abs(num)) {
                    alive = false;   
                    break;
                }
                else {
                    st.pop();          
                }
            }

            if (alive) {
                st.push(num);
            }
        }

        return new ArrayList<>(st);
    }
}



// class Solution {
//     public ArrayList<Integer> reducePairs(int[] arr) {
//         // code here
//         ArrayList<Integer> list=new ArrayList<>();
//         Stack<Integer> st=new Stack<>();
//         int sign=0;
//         int sign1=0;
        
//         for(int i=0;i<arr.length;i++)
//         {
//             boolean alive=true;
//             sign1=arr[i]<0 ? 0 : 1;
//             while(!st.isEmpty() && st.peek()*arr[i] < 0)
//             {
//                 if(Math.abs(st.peek())==Math.abs(arr[i]))
//                 {
//                     alive=false;
//                     st.pop();
//                     break;
//                 }
//                 else if((sign==0 && arr[i]>0) && Math.abs(st.peek())>Math.abs(arr[i]))  
//                 {
//                     alive=false;
//                     if(!st.isEmpty()) sign=st.peek()<0 ? 0 : 1;
//                     break;
                    
//                 }
//                 else if((sign==1 && arr[i]<0) && Math.abs(st.peek())>Math.abs(arr[i]))
//                 {
//                     alive=false;
//                     break;
//                 }
//                 else if((sign==1 && arr[i]<0) && Math.abs(st.peek())<Math.abs(arr[i]))
//                 {
//                     st.pop();
                    
//                     if(!st.isEmpty()) sign=st.peek()<0 ? 0 : 1;
                    
//                 }
//                 else break;
//             }
//             if(st.isEmpty() && alive==true) 
//             {
//                 st.push(arr[i]);
//                 sign=arr[i]<0 ? 0 : 1;
//             }
//             else if(alive==true) 
//             {
//                 if((Math.abs(st.peek()) < Math.abs(arr[i])) || (st.peek()<0 && arr[i]<0) || (st.peek()>0 && arr[i]>0))
//             {
//                 st.push(arr[i]);
//                 sign=arr[i]<0 ? 0 : 1;
//             }
//             }
//         }
//         while(!st.isEmpty())
//         {
//             list.add(st.pop());
//         }
//         Collections.reverse(list);
//         return list;
//     }
// }