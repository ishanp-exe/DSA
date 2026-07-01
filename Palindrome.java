//https://leetcode.com/problems/palindrome-number/description/

import java.util.*;
public class Palindrome {
      public boolean isPalindrome(int x) {
            if (x < 0) {
                return false;
            }
            int rev = 0;
            int num = x;

            while (num != 0) {
                rev = rev * 10 + num % 10;
                num = num / 10;
            }

            return (rev == x);
        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        Palindrome obj = new Palindrome();
        System.out.println(obj.isPalindrome(x));
    }
}
