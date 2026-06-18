//https://leetcode.com/problems/richest-customer-wealth/description/

import java.util.Scanner;

public class Richest_Customer {
    static int maximumWealth(int[][] accounts) {
        int ans = 0;
        for(int i=0; i<accounts.length; i++){
            int sum = 0;
            for(int j=0; j<accounts[i].length; j++){
                sum = sum + accounts[i][j];
            }
            if(sum>ans){
                ans = sum;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();//row size
        int n = sc.nextInt();//col size
        int[][] accounts = new int[m][n];//initialization of arr with m rows and n col
        for(int i=0; i<accounts.length; i++){
            for(int j=0; j<accounts[i].length; j++){
                accounts[i][j] = sc.nextInt();
            }
        }
        System.out.println(maximumWealth(accounts));


}
}