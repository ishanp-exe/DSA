//https://leetcode.com/problems/concatenate-non-zero-digits-and-multiply-by-sum-i/description/?envType=daily-question&envId=2026-07-07

import java.util.*;
public class Concatenate_NonZero{
    public long sumAndMultiply(int n) {
        long x = 0,sum = 0,len = 1;
        while(n != 0){
            x = (n % 10) * len + x;
            if(n % 10 != 0) len = len * 10;
            sum += n % 10;
            n = n / 10;
        }
        return sum * x;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Concatenate_NonZero obj = new Concatenate_NonZero();
        System.out.println(obj.sumAndMultiply(n));
    }
}