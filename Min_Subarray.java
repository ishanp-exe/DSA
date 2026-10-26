import java.util.Scanner;

public class Min_Subarray {
    public static int minSubArrayLen(int target, int[] nums) {
        int l = 0, sum = 0;
        int ans = Integer.MAX_VALUE;
        for (int r = 0; r < nums.length; r++) {
            sum += nums[r];
            while (sum >= target) {
                ans = Math.min(ans, r - l + 1);
                sum -= nums[l];
                l++;
            }
        }
        return ans == Integer.MAX_VALUE ? 0 : ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) nums[i] = sc.nextInt();
        System.out.println(minSubArrayLen(target, nums));
    }
}
