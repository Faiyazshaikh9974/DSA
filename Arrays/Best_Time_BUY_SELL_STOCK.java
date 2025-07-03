public class Best_Time_BUY_SELL_STOCK {

    public static int MAX_Profit(int price []){
        int maxProfit = 0;
        int Buying_Price = Integer.MAX_VALUE;

        for(int i=0; i<price.length; i++){
            if(Buying_Price < price[i]){
                //formula to calculate profit current profit...
                int profit = price[i] - Buying_Price; 
                //global variable that store the value of maximum from both...
                maxProfit = Math.max(maxProfit, profit);
                

            }else{
                Buying_Price = price[i];
            }
        }

        return maxProfit;
    }
    public static void main(String[] args) {
        int price [ ] = {7,1,5,3,6,4};

        System.out.println(MAX_Profit(price));

    }
}
