//https://leetcode.com/problems/maximum-subarray/description/

import java.util.*;
public class Maximum_Subarray {
    public int maxSubArray(int[] nums) {
        int total = 0;
        int res = nums[0];
        for(int n:nums){
            if(total<0){
                total = 0;
            }
            total = total + n;
            res = Math.max(res, total);
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0; i<n; i++){
            nums[i] = sc.nextInt();
        }
        Maximum_Subarray obj = new Maximum_Subarray();
        int ans = obj.maxSubArray(nums);

        System.out.println(ans);
    }
}
