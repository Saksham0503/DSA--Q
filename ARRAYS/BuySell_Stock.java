package ARRAYS;
public class BuySell_Stock {
    //FUNCTION
  public static int buyAndSellStock (int prices []){
    int buyingPrice = Integer.MAX_VALUE;  // +infinity
    int maxProfit = 0;   

     for (int i =0 ; i < prices.length ; i++){
        //selling price on that day
        int sellingPrice = prices[i];
        
        if (sellingPrice>buyingPrice){   //PROFIT
          int profit = sellingPrice - buyingPrice;  //TODAY'S PROFIT
          maxProfit = Math.max(maxProfit,profit);   //MAX PROFIT
        }else{
            buyingPrice = sellingPrice ;
        }
    }
    return maxProfit ;
}
    public static void main(String[] args) {
        int prices [] = {7, 1 ,5 , 3, 6, 4};
        int bestProfit = buyAndSellStock(prices); //CALLING THE FUNCTION
        System.out.println("THE BEST PROFIT FOR THE STOCK is -->> "+ bestProfit);
    }
}
