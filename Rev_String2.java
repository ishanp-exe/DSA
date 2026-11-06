//https://leetcode.com/problems/reverse-string-ii/description/

import  java.util.*;
public class Rev_String2 {
     public String reverseStr(String s, int k) {
        char[] a = s.toCharArray();
        for(int i=0; i<a.length; i+=2*k){
            int l = i;
            int r = Math.min(i+k-1, a.length-1);
            while(l<r){
                char temp = a[l];
                a[l] = a[r];
                a[r] = temp;
                l++;
                r--;
            }
        }
        return new String(a);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int k = sc.nextInt();
        Rev_String2 obj = new Rev_String2();
        System.out.println(obj.reverseStr(s,k));
    }
}
