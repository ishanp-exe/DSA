import java.util.Scanner;

public class Buy_Sell_Stock {
     public int maxProfit(int[] prices) {
       int buy = prices[0];
       int profit = 0;
       for(int i=0; i<prices.length; i++){
        if(prices[i]<buy){
            buy = prices[i];
        }else if(prices[i] - buy > profit){
            profit = prices[i] - buy;
        }
       }
       return profit;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
    }
    Buy_Sell_Stock obj = new Buy_Sell_Stock();
    System.out.println(obj.maxProfit(arr));
  }
}
