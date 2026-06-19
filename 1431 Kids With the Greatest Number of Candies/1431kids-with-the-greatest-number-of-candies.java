class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result= new ArrayList<>();
        int greatestCandies = 0;
        for(int i=0;i<candies.length;i++) {
            if (candies[i]>greatestCandies) {
                greatestCandies=candies[i];
            }
        }
        for(int i=0;i<candies.length;i++) {
            if (candies[i]+extraCandies >= greatestCandies) {
                result.add(true);
            } else {
                result.add(false);
            }
        }
        return result;
    }
}