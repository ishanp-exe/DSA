//https://leetcode.com/problems/detect-capital/description/

import java.util.*;
public class Detect_Capital {
    public boolean detectCapitalUse(String word) {
        int capital=0;
        for(int i=0; i<word.length();i++){
            if(Character.isUpperCase(word.charAt(i))){
                capital++;
            }
        }
        return capital == word.length() //al capital
        || capital == 0 //no capital 
        || (capital == 1 && Character.isUpperCase(word.charAt(0))); //only one capital that too the first letter
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();

        Detect_Capital obj = new Detect_Capital();
        System.out.println(obj.detectCapitalUse(word));
    }
}
