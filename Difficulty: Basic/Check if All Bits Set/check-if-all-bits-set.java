class Solution {
    public boolean isBitSet(int n) {
        // code here
       return n++ > 0 && (n & --n) == 0;
    }
};