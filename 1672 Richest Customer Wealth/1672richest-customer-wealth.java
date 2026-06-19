class Solution {
    public int maximumWealth(int[][] accounts) {
        int richestCust=0;
        int richestCustWealth = 0;
        for(int i=0;i<accounts.length;i++) {
            int tempSum = 0;
            for(int j=0;j<accounts[0].length;j++) {
                tempSum+=accounts[i][j];
            }
            if (tempSum>richestCustWealth) {
                richestCust=i;
                richestCustWealth=tempSum;
            }
        }
        return richestCustWealth;
    }
}