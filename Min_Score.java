//https://leetcode.com/problems/minimum-score-by-changing-two-elements/description/?envType=daily-question&envId=2026-11-19

import java.util.*;
public class Min_Score {
    public int minimizeSum(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        return Math.min(Math.min(nums[n-1] - nums[2], nums[n-3] - nums[0]), nums[n-2] - nums[1]);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.println(new Min_Score().minimizeSum(nums));
        sc.close();
    }
}
