//https://leetcode.com/problems/search-in-rotated-sorted-array/

import java.util.Scanner;

public class Rotated_Binary_Search {
    static int findPivot(int[] nums){
        int l = 0;
        int r = nums.length-1;

        while(l<r){
            int mid = l+(r-l)/2;
            if(nums[mid] > nums[r]){
                l = mid+1;
            }else{
                r = mid;
            }
        }
        return r;
    }

    static int binarySearch(int[] nums, int l, int r, int target){
        int idx = -1;
        while(l<=r){
            int mid = l+(r-l)/2;
            if(nums[mid] == target){
                idx = mid;
                break;
            }else if(nums[mid] < target){
                l = mid+1;
            }else{
                r = mid-1;
            }
        }
        return idx;
    }


    static int search(int[] nums, int target) {
        int pivot_index = findPivot(nums);
        int idx = binarySearch(nums, 0, pivot_index-1, target); //left side of pivot index
        if (idx!= -1){
            return idx;
        }else{
            idx = binarySearch(nums, pivot_index, nums.length-1, target); //right side including pivot index
            return idx;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0; i<nums.length; i++){
            nums[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        System.out.println(search(nums, target));
    }
}
