int maxProfit(int* prices, int n) {
    int small=prices[0];
    int maxprofit=0;
    for(int i=1;i<n;i++){
        if(small>prices[i]){
            small=prices[i];
        }
        else if(prices[i]-small > maxprofit){
            maxprofit=prices[i]-small;
        }
    }
    return maxprofit;
}