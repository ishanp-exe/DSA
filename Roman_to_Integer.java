//https://leetcode.com/problems/roman-to-integer/

import java.util.*;

public class Roman_to_Integer {
    static int getVal(char ch){
        switch(ch) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default : return 0;
        }
    }

    static int romanToInt(String s) {
        int n = s.length();
        int sum = 0;
        for(int i = 0; i < n; i++){
            char ch1 = s.charAt(i);
            if((i+1) < n && getVal(ch1) < getVal(s.charAt(i+1))){
                sum = sum - getVal(ch1);
            } else {
                sum = sum + getVal(ch1);
            }
        }
        return sum;
    }
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int ans = romanToInt(s);

        System.out.println(ans);
    }
}
