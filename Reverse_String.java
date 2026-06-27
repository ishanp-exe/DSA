//https://leetcode.com/problems/reverse-string/description/

import java.util.*;
public class Reverse_String {
    public void reverseString(char[] s) {
       int i=0;
        int j=s.length-1;
        while(i<j){
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            i++;
            j--;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] arr = s.toCharArray();
        Reverse_String obj = new Reverse_String();

        obj.reverseString(arr);
        System.out.println(Arrays.toString(arr));
    }
}
