class Solution {
    public int countTriples(int n) {
        int noOfSquareTriplets = 0;
        for(int k=n;k>0;k--) {
            for(int i=1;i<k;i++) {
                for(int j=i;j<k;j++) {
                    if ((i*i)+(j*j) == k*k) noOfSquareTriplets+=2;
                }
            }
        }
        return noOfSquareTriplets;
    }
}