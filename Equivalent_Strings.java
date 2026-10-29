//https://leetcode.com/problems/check-if-two-string-arrays-are-equivalent/description/

import java.util.*;
public class Equivalent_Strings {
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2){
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        for(String s:word1){
            sb1.append(s);
        }
        for(String s:word2){
            sb2.append(s);
        }
        return sb1.toString().equals(sb2.toString());
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] word1 = sc.nextLine().split("\\s+");
        String[] word2 = sc.nextLine().split("\\s+");

        System.out.println(arrayStringsAreEqual(word1, word2));
    }
}
