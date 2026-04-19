class Solution {
    public boolean isPower(int x, int y) {
        if(x==1){
            if(y==1)return true;
            return false;
        }
        double rx = Math.log(x);
        double ry = Math.log(y);
        double ddiv = ry/rx;
        int div = (int)ddiv;
        int pl = (int)Math.pow(x,div);
        if(pl==y)return true;
        int ph = (int)Math.pow(x,div+1);
        if(ph==y)return true;
        return false;
    }
}