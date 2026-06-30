class Solution {
    public boolean validMountainArray(int[] arr) {
        if (arr.length < 3) return false;
        int peak = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] == arr[i]) return false;
            if (arr[i - 1] > arr[i]) break;
            peak++;
        }
        if (peak == 0 || peak == arr.length - 1) return false;

        for (int i = peak + 1; i < arr.length; i++) {
            if (arr[i - 1] <= arr[i]) return false;
        }
        return true;
    }
}