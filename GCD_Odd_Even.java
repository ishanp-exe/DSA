//https://leetcode.com/problems/gcd-of-odd-and-even-sums/description/

import java.util.*;
public class GCD_Odd_Even {
     public int gcdOfOddEvenSums(int n) {
        return n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        GCD_Odd_Even obj = new GCD_Odd_Even();
        System.out.println(obj.gcdOfOddEvenSums(n));
    }
}
