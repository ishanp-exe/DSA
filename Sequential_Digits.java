
import java.util.*;

public class Sequential_Digits {
        public List<Integer> sequentialDigits(int low, int high) {

            String digits = "123456789";

            List<Integer> ans = new ArrayList<>();

            int minLen = String.valueOf(low).length();
            int maxLen = String.valueOf(high).length();

            for (int len = minLen; len <= maxLen; len++) {

                for (int start = 0; start + len <= 9; start++) {

                    int num = Integer.parseInt(digits.substring(start, start + len));

                    if (num >= low && num <= high) {
                        ans.add(num);
                    }
                }
            }

            return ans;
        }
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int low = sc.nextInt();
        int high = sc.nextInt();

        Sequential_Digits obj = new Sequential_Digits();
        List<Integer> result = obj.sequentialDigits(low,high);

        System.out.println(result);
    }

}