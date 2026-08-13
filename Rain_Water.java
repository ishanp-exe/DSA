//https://leetcode.com/problems/trapping-rain-water/description/

import java.util.*;

public class Rain_Water {
    static int[] getLeftMax(int[] height, int n) {
        int[] leftMax = new int[n];
        leftMax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], height[i]);
        }
        return leftMax;
    }

    static int[] getRightMax(int[] height, int n) {
        int[] rightMax = new int[n];
        rightMax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i + 1], height[i]);
        }
        return rightMax;
    }

    public int trap(int[] height) {
        int n = height.length;
        if (n == 0 || n == 1)
            return 0;

        int[] leftMax = getLeftMax(height, n);
        int[] rightMax = getRightMax(height, n);

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += Math.min(leftMax[i], rightMax[i]) - height[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();// no. of bars

        int[] height = new int[n];
        for (int i = 0; i < n; i++) {
            height[i] = sc.nextInt();
        }
        Rain_Water obj = new Rain_Water();
        System.out.println(obj.trap(height));
    }
}
