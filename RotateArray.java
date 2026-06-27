//https://leetcode.com/problems/rotate-array/

import java.util.*;
public class RotateArray {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k%n;
        Reverse(nums, 0 , n-1); //reverse whole array
        Reverse(nums, 0, k-1); //reverse first k elements
        Reverse(nums, k, n-1); //reverse from k elements to end
}
void Reverse(int[] nums, int s, int e){
    while(e>s){
        //swap
        int temp = nums[s];
        nums[s] = nums[e];
        nums[e] = temp;
        //we are using 2 pointers so s should increase and e should decrease by every rotation/swap
        s++;
        e--;
    }
 }
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] nums = new int[n];
    for(int i=0; i<n; i++){
        nums[i] = sc.nextInt();
    }
    int k = sc.nextInt();
    RotateArray obj = new RotateArray();
    obj.rotate(nums, k);
    System.out.println(Arrays.toString(nums));
 }
}
