//https://leetcode.com/problems/maximum-product-subarray/

import java.util.*;
public class Max_Prod_Subarray {
    public int maxProduct(int[] nums) {
        int max = nums[0], min = nums[0], ans = nums[0];
        for(int i=1; i<nums.length; i++){
            int temp = max; //saving for future use as max value will be updated
            max = Math.max(Math.max(max*nums[i], min*nums[i]), nums[i]);
            min = Math.min(Math.min(temp*nums[i], min*nums[i]), nums[i]);

            if(max>ans){
                ans = max;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        Max_Prod_Subarray obj = new Max_Prod_Subarray();
        System.out.println(obj.maxProduct(arr));
    }
}
