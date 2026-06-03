class Solution {
    public int maxProfit(int[] prices) {

        if(prices.length < 2){
            return 0;
        }

        int maxProfit = 0;
        int curIndex = 0;

        for(int i=1; i< prices.length;i++){

            if(prices[i] < prices[curIndex]){
                curIndex = i;
            }else {
                maxProfit = Math.max(prices[i]-prices[curIndex], maxProfit);    
            }

        }

        return maxProfit;
        
    }
}
