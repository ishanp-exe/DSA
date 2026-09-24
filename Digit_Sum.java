//https://leetcode.com/problems/smallest-index-with-digit-sum-equal-to-index/?envType=daily-question&envId=2026-09-24

import java.util.*;

public class Digit_Sum {
    public int smallestIndex(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int x = nums[i];
            int sum = 0;

            while (x > 0) {
                sum = sum + x % 10;
                x = x / 10;
            }
            if (sum == i)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Digit_Sum obj = new Digit_Sum();
        System.out.println(obj.smallestIndex(arr));
    }

}
