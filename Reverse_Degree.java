//https://leetcode.com/problems/reverse-degree-of-a-string/?envType=daily-question&envId=2026-09-20

import java.util.*;
public class Reverse_Degree {  
    public int reverseDegree(String s) {
        int sum = 0;
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);

            int reverseValue = 26 - (c - 'a');
            int position = i+1;

            sum += reverseValue * position;
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        Reverse_Degree obj = new Reverse_Degree();
        System.out.println(obj.reverseDegree(s));
    }
}
