//https://leetcode.com/problems/count-elements-with-strictly-smaller-and-greater-elements/description/

import java.util.*;
public class Count_Elements {
     public int countElements(int[] nums) {
        int min = nums[0];
        int max = nums[0];
        for (int x : nums) {
            min = Math.min(min, x);
            max = Math.max(max, x);
        }
        int count = 0;
        for (int x : nums) {
            if (x > min && x < max) {
                count++;
            }
        }
        return count;
    }
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        Count_Elements obj = new Count_Elements();
        System.out.println(obj.countElements(nums));
    }

}
