//https://leetcode.com/problems/set-mismatch/

import java.util.*;
public class SetMismatch {
    public int[] findErrorNums(int[] nums) {
        int i=0;
        while(i<nums.length){
            int correct = nums[i]-1;
            if(nums[i] != nums[correct]){
                swap(nums,i,correct);
            }else{
                i++;
            }
        }
        //search for duplicate and missing number 
        for(int idx=0; idx<nums.length; idx++){
            if(nums[idx] != idx+1){
                return new int[]{nums[idx],idx+1};
            }
        }
        return new int[]{-1,-1};
    }
   public void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
   }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        SetMismatch obj = new SetMismatch();
        System.out.println(Arrays.toString(obj.findErrorNums(nums)));
    }
}
