import java.util.Arrays;
class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length()!=t.length()) return false;
        char[] sarr = s.toCharArray();
        char[] tarr = t.toCharArray();
        Arrays.sort(sarr);
        Arrays.sort(tarr);
        String stemp=new String(sarr);
        String ttemp=new String(tarr);
        if(stemp.equals(ttemp)) return true;
        else return false;

    }
}