
//https://leetcode.com/problems/find-all-duplicates-in-an-array/
import java.util.*;

public class FindAllDuplicates {
    public List<Integer> findDuplicates(int[] nums) {
        // cycle sort
        int i = 0;
        while (i < nums.length) {
            int correct = nums[i] - 1;
            if (nums[i] != nums[correct]) {
                swap(nums, i, correct);
            } else {
                i++;
            }
        }

        List<Integer> ans = new ArrayList<>();
        for (int idx = 0; idx < nums.length; idx++) {
            if (nums[idx] != idx + 1) {
                ans.add(nums[idx]);
            }
        }
        return ans;
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
        FindAllDuplicates obj = new FindAllDuplicates();
        System.out.println(obj.findDuplicates(nums));
    }
}
