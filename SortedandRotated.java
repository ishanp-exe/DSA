//https://leetcode.com/problems/check-if-array-is-sorted-and-rotated/description/

import java.util.*;
public class SortedandRotated {
    public boolean check(int[] nums) {
        int n = nums.length;
        int pivot = 0;
        for(int i=0; i<n; i++){
            if(nums[i] > nums[(i+1) % n]){//comparing with next element and wrap around case
                pivot++; 
            }
        }
        return pivot <=1; //valid for 0 or only 1 pivot
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0; i<n; i++){
            nums[i] = sc.nextInt();
        }
        SortedandRotated obj = new SortedandRotated();
        System.out.println(obj.check(nums));
    }
}
