//https://leetcode.com/problems/binary-search/description/

import java.util.*;
public class Binary_Search {
    public int search(int[] nums, int target) {
        int l=0;
        int r=nums.length-1;
        while(l<=r){
            int mid = l + (r-l)/2;
            if(target < nums[mid]){
                r=mid-1;
            }else if(target > nums[mid]){
                l = mid+1;
            }else{
                return mid;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        Binary_Search obj = new Binary_Search();
        System.out.println(obj.search(arr, target));
    }
}
