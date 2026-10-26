//https://leetcode.com/problems/maximum-number-of-vowels-in-a-substring-of-given-length/description/

import java.util.*;
public class Max_Vowel {
    static boolean isVowel(char c) {
        return "aeiou".indexOf(c) >= 0;
    }

    public static int maxVowels(String s, int k) {
        int vowel = 0, max = 0;
        for (int i = 0; i < k; i++) {
            if (isVowel(s.charAt(i))) vowel++;
        }
        max = vowel;
        for (int i = k; i < s.length(); i++) {
            if (isVowel(s.charAt(i - k))) vowel--;
            if (isVowel(s.charAt(i))) vowel++;
            max = Math.max(vowel, max);
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int k = sc.nextInt();
        System.out.println(maxVowels(s, k));
    }
}