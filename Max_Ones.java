//https://leetcode.com/problems/max-consecutive-ones/description/

import java.util.*;
public class Max_Ones {
    public int findMaxConsecutiveOnes(int[] nums) {

        int count = 0;
        int ans = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                count++;
                ans = Math.max(ans, count);
            } else {
                count = 0;
            }
        }

        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        Max_Ones obj = new Max_Ones();
        System.out.println(obj.findMaxConsecutiveOnes(arr));
    }
}
