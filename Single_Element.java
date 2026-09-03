//https://leetcode.com/problems/single-element-in-a-sorted-array/description/

import java.util.*;
public class Single_Element{
    public int singleNonDuplicate(int[] nums) {
        int l = 0;
        int r = nums.length - 1;
        while (l < r) {
            int mid = l + (r - l) / 2;
            if (mid % 2 == 1) {//force mid to be even as we are comparing pair boundaries 
                mid--;
            }
            if (nums[mid] != nums[mid + 1]) {
                r = mid; //single element is at or before mid
            } else {
                l = mid + 2; //single element is after this pair
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
        Single_Element obj = new Single_Element();
        int ans = obj.singleNonDuplicate(arr);

        System.out.println(ans);
    }
}