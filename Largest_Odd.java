//https://leetcode.com/problems/largest-odd-number-in-string/description/

import java.util.*;
public class Largest_Odd {
    public String largestOddNumber(String num) {
        int i = num.length()-1;
        while(i>=0){
            int n = num.charAt(i) - '0'; //string to int
            if(n%2==1) return num.substring(0,i+1);
            i--;
        }
    return "";
        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.next();
        
        Largest_Odd obj = new Largest_Odd();
        String ans = obj.largestOddNumber(num);
        System.out.println(ans);

    }
}
