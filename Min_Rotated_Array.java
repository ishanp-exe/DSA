//https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/

import java.util.*;
public class Min_Rotated_Array {
    public int findMin(int[] nums) {
        int l = 0;
        int r = nums.length-1;

        while(l<r){
            int mid = l + (r-l)/2;
            if(nums[mid] <= nums[r]){
                r = mid;
            }else{
                l = mid+1;
            }
        }
        return nums[l];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        Min_Rotated_Array obj = new Min_Rotated_Array();
        int ans = obj.findMin(arr);
        System.out.println(ans);
    }
}
