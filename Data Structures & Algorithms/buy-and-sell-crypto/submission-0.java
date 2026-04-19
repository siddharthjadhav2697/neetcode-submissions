class Solution {
    public int maxProfit(int[] prices) {
        int min = 100000;
        int profit=0;

        for(int i: prices){
            if(i<min){
                min = i;
            } else if(i-min > profit){
                profit = i-min;
            }
        }
        return profit;
    }
}
