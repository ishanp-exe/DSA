//https://leetcode.com/problems/sort-array-by-parity/

import java.util.*;
public class Sort_Parity {
    public int[] sortArrayByParity(int[] nums) {
        int i=0,  j=nums.length-1;
        while(i<j){
            if(nums[i]%2==0){
                i++;
            }else if(nums[j]%2 != 0){
                j--;
            }else{
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }
        return nums;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        Sort_Parity obj = new Sort_Parity();
        int[] ans = obj.sortArrayByParity(nums);

        System.out.println(Arrays.toString(ans));
        sc.close();
    }
}
