//https://leetcode.com/problems/squares-of-a-sorted-array/

import java.util.*;
public class Square_sorted_array {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] result = new int[n]; //putting largest square in new array
        int l=0;
        int r=n-1;
        int i=n-1; //indexing starting from last
    
        while(l<=r){
            int leftsquare = nums[l]*nums[l];
            int rightsquare = nums[r]*nums[r];

            if(leftsquare>rightsquare){
                result[i] = leftsquare;
                l++;
            }else{
                result[i] = rightsquare;
                r--;
            }
            i--; //after every iteration, move indexing backwards
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        Square_sorted_array obj = new Square_sorted_array();
        int[] ans = obj.sortedSquares(nums);

        System.out.println( Arrays.toString(ans));
        
        sc.close();
    }
}
