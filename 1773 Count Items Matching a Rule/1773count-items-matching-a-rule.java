class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int temp=0;
        int noOfItems=0;
        if(ruleKey.equals("color")) temp=1;
        if(ruleKey.equals("name")) temp=2;
        for(int i=0;i<items.size();i++) {
            if (items.get(i).get(temp).equals(ruleValue)) noOfItems++;
        }
        return noOfItems;
    }
}