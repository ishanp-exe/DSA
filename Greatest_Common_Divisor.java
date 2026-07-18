//https://leetcode.com/problems/find-greatest-common-divisor-of-array/description/?envType=daily-question&envId=2026-07-18

import java.util.*;
public class Greatest_Common_Divisor {
        public int findGCD(int[] nums) {
            int min = nums[0], max = nums[0];

            for (int ele : nums) {
                min = Math.min(min, ele);
                max = Math.max(max, ele);
            }

            return gcd(min, max);
        }

        private int gcd(int a, int b) {
            if (b == 0)
                return a;
            return gcd(b, a % b);
        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        Greatest_Common_Divisor obj = new Greatest_Common_Divisor();
        System.out.println(obj.findGCD(arr));
    }
}
