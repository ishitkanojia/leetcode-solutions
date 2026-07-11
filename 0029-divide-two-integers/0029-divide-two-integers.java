class Solution {
    public int divide(int dividend, int divisor) {
        if (dividend==Integer.MIN_VALUE&&divisor==-1)return Integer.MAX_VALUE;
        boolean negative=(dividend<0)^(divisor<0);
        long dvd=Math.abs((long)dividend);
        long dvs=Math.abs((long)divisor);
        long quotient=0;
        for (int i=31;i>=0;i--){
            if ((dvs<<i)<=dvd){
                dvd-=(dvs<<i);
                quotient+=(1L<<i);
            }
        }
        return negative?(int)-quotient:(int)quotient;
    }
}