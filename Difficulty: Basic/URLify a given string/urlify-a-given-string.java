class Solution {
    String URLify(String s) {
        // code here
        s=s.replaceAll("\\s","%20");
        return s;
    }
}