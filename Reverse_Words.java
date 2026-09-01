//https://leetcode.com/problems/reverse-words-in-a-string/

import java.util.*;
public class Reverse_Words {
    public String reverseWords(String s) {
        String[] str = s.split("\\s+"); //remove trailing and leading spaces 
        StringBuilder sb = new StringBuilder();

        for(int i=str.length-1; i>=0; i--){
            sb.append(str[i]);
            sb.append(" ");
        }
        return sb.toString().trim();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Reverse_Words obj = new Reverse_Words();
        System.out.println(obj.reverseWords(s));
    }
}
