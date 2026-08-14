//https://leetcode.com/problems/maximum-length-substring-with-two-occurrences/description/?envType=daily-question&envId=2026-08-14

import java.util.*;
public class SubstringWith2Occurences{
    public int maximumLengthSubstring(String s) {
        int[] freq = new int[26];
        int l = 0;
        int ans = 0;

        for (int r = 0; r < s.length(); r++) {
            freq[s.charAt(r) - 'a']++; //converts letters into index
    
    //if letter frequency is greater than 2; decrease the window from left side until char count goes back to 2 oe less 
            while (freq[s.charAt(r) - 'a'] > 2) { 
                freq[s.charAt(l) - 'a']--;
                l++;
            }
            ans = Math.max(ans, r - l + 1); //r-l+1 is the size of window; we are choosing max length of substring
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        SubstringWith2Occurences obj = new SubstringWith2Occurences();
        int result = obj.maximumLengthSubstring(s);

        System.out.println(result);
    }
}