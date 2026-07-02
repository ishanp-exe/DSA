//https://leetcode.com/problems/reverse-integer/

import java.util.*;
public class Reverse_Integer {
    public int reverse(int x) {
        int rev = 0;
        while (x != 0) {
            int digit = x % 10;
            if (rev > Integer.MAX_VALUE / 10 || rev < Integer.MIN_VALUE / 10) {
                return 0;
            }
            rev = (rev * 10) + digit;
            x = x / 10;
        }
        return rev;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Reverse_Integer obj = new Reverse_Integer();
        System.out.println(obj.reverse(n));
    }
}
