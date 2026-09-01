//https://leetcode.com/problems/search-insert-position/description/

import java.util.*;
public class Insert_Position {
     public int searchInsert(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;

        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return l;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();

        Insert_Position obj = new Insert_Position();
        int ans = obj.searchInsert(arr, k);
        System.out.println(ans);
    }
}
