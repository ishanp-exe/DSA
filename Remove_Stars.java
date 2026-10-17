//https://leetcode.com/problems/removing-stars-from-a-string/

import java.util.*;
public class Remove_Stars {
     public String removeStars(String s) {
        StringBuilder stack = new StringBuilder();
        for(char ch:s.toCharArray()){
            if(ch =='*'){
                stack.deleteCharAt(stack.length()-1);
            }else{
                stack.append(ch);
            }
        }
        return stack.toString();
    }
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        Remove_Stars obj = new Remove_Stars();
        System.out.println(obj.removeStars(s));
        sc.close();
    }
}
