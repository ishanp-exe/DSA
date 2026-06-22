//https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/
import java.util.Scanner;

public class Remove_Duplicate {
    static int removeDuplicates(int[] nums) {
        if(nums.length == 0)
            return 0;
        
        int i = 1;
        for(int j = 1; j<nums.length; j++){
            if(nums[j] != nums[j-1]){
                nums[i] = nums[j];
                i++;
            }
         } 
        return i;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0; i<n; i++){
        nums[i] = sc.nextInt();
    }
        System.out.println(removeDuplicates(nums));
    }

}
