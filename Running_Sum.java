//https://leetcode.com/problems/running-sum-of-1d-array/
import java.util.*;

public class Running_Sum {
    static int[] runningSum(int[] nums) {
        for(int i = 1; i<nums.length; i++){
            nums[i] = nums[i-1] + nums[i];
        }
        return nums;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0; i<nums.length; i++){
            nums[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(runningSum(nums)));
    }
}
