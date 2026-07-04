//https://leetcode.com/problems/single-number/submissions/2056003999/

import java.util.*;

public class Single_Number {
    public int singleNumber(int[] nums) {
        int single = 0;
        for (int i = 0; i < nums.length; i++) {
            single = single ^ nums[i]; // a^a =0; a^0
        }
        return single; // all duplicates removed due to xor hence unique element remains
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0; i<n; i++){
            nums[i] = sc.nextInt();
        }
        Single_Number obj = new Single_Number();
        System.out.println(obj.singleNumber(nums));
    }
}
