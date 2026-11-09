import java.util.Scanner;

public class Unique_Elements {
    public int sumOfUnique(int[] nums) {
        int[] freq = new int[101];
        for (int num : nums) {
            freq[num]++;
        }
        int sum = 0;
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] == 1) {
                sum += i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println(new Unique_Elements().sumOfUnique(nums));
    }
}
