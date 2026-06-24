class Solution {
    public boolean isPalindrome(String s) {
        if (s.isEmpty()) return true;
        if (s.trim().isEmpty()) return true;
        String temp = "";
        for (char ch : s.toLowerCase().toCharArray()) {
            if (ch >= 'a' && ch <= 'z') temp+=ch;
            if (ch >= '0' && ch <= '9') temp+=ch;
        }
        int left=0; int right=temp.length()-1;
        while(left<right) {
            if (!(temp.charAt(left++)==temp.charAt(right--)))return false;
        }
        return true;
    }
}