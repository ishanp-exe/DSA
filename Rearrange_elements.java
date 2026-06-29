//https://leetcode.com/problems/rearrange-array-elements-by-sign/description/
import java.util.*;

public class Rearrange_elements {
    public int[] rearrangeArray(int[] nums) {
        int[] ans = new int[nums.length];
        int pos = 0, neg = 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                ans[pos] = nums[i];
                pos += 2;
            } else {
                ans[neg] = nums[i];
                neg += 2;
            }
        }  
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;  i<n; i++){
            arr[i] = sc.nextInt();
        }
        Rearrange_elements obj = new Rearrange_elements();
        System.out.println(Arrays.toString(obj.rearrangeArray(arr)));
    }
}
