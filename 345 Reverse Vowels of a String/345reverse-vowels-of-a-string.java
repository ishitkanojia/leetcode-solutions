class Solution {
    public String reverseVowels(String s) {
        String v = "aeiouAEIOU";
        char[] arr = s.toCharArray();
        int l=0; int r=arr.length-1;
        while (l<r) {
            while (l<r && !v.contains(String.valueOf(arr[l])) ) {
                l++;
            }
            while (l<r && !v.contains(String.valueOf(arr[r])) ) {
                r--;
            }
            char temp = arr[l];
            arr[l] = arr[r];
            arr[r]=temp;
            l++; r--;
        }
        return new String(arr);
    }
}