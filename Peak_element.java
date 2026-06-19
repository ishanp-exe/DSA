// https://leetcode.com/problems/find-peak-element/description/
import java.util.*;

public class Peak_element {
    static int findPeakElement(int[] nums){
        int l = 0;
        int r = nums.length-1;
        while(l<r){
            int mid = l + (r-l)/2;
            if(nums[mid] < nums[mid+1]){
                l = mid+1;
            }else{
                r = mid;
            }
        }
        return l;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0; i<nums.length; i++){
            nums[i] = sc.nextInt();
        }
        System.out.println(findPeakElement(nums));
    }
}
