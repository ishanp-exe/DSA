//https://leetcode.com/problems/maximum-ice-cream-bars/description/

import java.util.Arrays;
import java.util.Scanner;

public class MaxIceCream {
    static int maxIceCream(int[] costs, int coins){
        Arrays.sort(costs);
        int ans = 0;
        for(int cost : costs){
            if(cost > coins) break;
            ans++;
            coins = coins - cost;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] costs = new int[n];
        for(int i=0; i<costs.length; i++){
            costs[i] = sc.nextInt();
        }
        int coins = sc.nextInt();
        System.out.println(maxIceCream(costs,coins));
    }

}
