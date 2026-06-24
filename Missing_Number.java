//https://leetcode.com/problems/missing-number/description/

public class Missing_Number {
    static int missingNumber(int[] nums){ //cycle sort
        int i = 0;
        while(i<nums.length){
            int correct = nums[i] ; //we don't use arr[i]-1 because 1 element is already missing
            if(nums[i] < nums.length && nums[i] != nums[correct]){
                swap(nums,i,correct);
            }else{
                i++;
            }
        }
        //search for first missing number
        for(int idx=0; idx<nums.length; idx++){
            if(nums[idx] != idx){
                return idx;
            }
        }
        //case 2
        return nums.length; 
    }
    static void swap(int[] nums, int first, int second){
        int temp = nums[first];
        nums[first]=nums[second];
        nums[second] = temp;
    }

    public static void main(String[] args) {
        int[] nums = {4,0,1,2};
        System.out.println((missingNumber(nums)));
    }

}
