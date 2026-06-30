import java.util.HashSet;
class Solution {
    public int singleNumber(int[] nums) {
        int sno=0;
        for(int n:nums){
            sno^=n;
        }
        return sno;
    }
}