//https://leetcode.com/problems/first-missing-positive/
import java.util.*;

public class MissingPositive {
    public int firstMissingPositive(int[] nums) {
        int i=0;
        while(i<nums.length){
            int correct = nums[i] -1;
            if(nums[i]>0 && nums[i] <= nums.length && nums[i] != nums[correct]){
                swap(nums,i,correct);
            }else{
                i++;
            }
        }

        //search for first positive number
        for(int idx=0; idx<nums.length; idx++){
            if(nums[idx] != idx+1){
                return idx+1;
            }
        }
        //edge case
        return nums.length+1;
    }
    public void swap(int[] nums, int a, int b){
        int temp = nums[a];
        nums[a]=nums[b];
        nums[b]=temp;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        MissingPositive obj =  new MissingPositive();
        System.out.println(obj.firstMissingPositive(nums));
    }
}
