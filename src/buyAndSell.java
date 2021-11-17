public class buyAndSell {
    public int maxProfit(int[] prices) {
        if(prices.length==1){
            return 0;
        }
        int min=prices[0];
        int profit=0;
        for(int i=1;i<prices.length;i++){
            if(min>prices[i]){
                min=prices[i];
            }
            else if(profit<prices[i]-min){
                profit=prices[i]-min;
            }
        }
        return profit;
    }
}