//https://leetcode.com/problems/buy-two-chocolates/

import java.util.*;
public class Buy_Two_Chocolate {
    public int buyChoco(int[] prices, int money) {
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;

        for(int n:prices){
            if(n<min1){ //n smaller than first min
                min2 = min1; //first min become second min
                min1 = n; // n become first min
            }else if(n<min2){
                min2 = n; //second min updated
            }
        }
        int cost = min1+min2;
        if(cost <=money){
            return money - cost;
        }
        return money;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] prices = new int[n];
        for(int i=0; i<n; i++){
            prices[i] = sc.nextInt();
        }
        int money = sc.nextInt();
        Buy_Two_Chocolate obj = new Buy_Two_Chocolate();
        System.out.println(obj.buyChoco(prices, money));
    }
}
