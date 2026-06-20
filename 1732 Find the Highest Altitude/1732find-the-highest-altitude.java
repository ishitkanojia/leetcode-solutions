class Solution {
    public int largestAltitude(int[] gain) {
        int highestPoint=0;
        int currentAltitde=0;
        for (int i=0;i<gain.length;i++) {
            currentAltitde+=gain[i];
            if (currentAltitde>highestPoint) highestPoint=currentAltitde;
        }
        return highestPoint;
    }
}