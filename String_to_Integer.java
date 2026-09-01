//https://leetcode.com/problems/string-to-integer-atoi/

import java.util.*;
public class String_to_Integer {
    public int myAtoi(String s) {
        if(s==null || s.length()==0){
            return 0;
        }
        int INT_MAX = Integer.MAX_VALUE;
        int INT_MIN = Integer.MIN_VALUE;

        //checking for whitespace
        int i = 0;
        int n = s.length();
        while(i<n && s.charAt(i) == ' '){
            i++;
        }

        if(n==0){
            return 0;
        }
        //checking for sign
        int sign = 1;
        if(i<n && s.charAt(i) == '+'){
            i++;
        }else if(i<n && s.charAt(i) == '-'){
            sign = -1;
            i++;
        }
        //reading and converting digits
        long res = 0;
        while(i<n && Character.isDigit(s.charAt(i))){
            int digit = s.charAt(i) - '0'; //to get numeric value from a character digit
            res = res * 10 + digit;

            if(sign*res <= INT_MIN){
                return INT_MIN;
            }
            if(sign*res >= INT_MAX){
                return INT_MAX;
            }
            i++;
        }

        //apply sign and return
        return (int)(res*sign);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String_to_Integer obj = new String_to_Integer();

        String s = sc.nextLine();
        int ans = obj.myAtoi(s);
        System.out.println(ans);
    }
}
