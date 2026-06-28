class Solution {
    public int maxProfit(int[] prices) {
        int min_price=Integer.MAX_VALUE;
        int max_profit=0;

        for(int i:prices){
            if(min_price>i){
            min_price=i;
            }else{
                int profit=i-min_price;
                if(profit>max_profit){
                    max_profit=profit;
                }
            }
        }
        return max_profit;
    }
}