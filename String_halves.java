//https://leetcode.com/problems/determine-if-string-halves-are-alike/description/

import java.util.*;
public class String_halves {
    String vowels = "aeiouAEIOU";

    public boolean halvesAreAlike(String s){
        int mid = s.length()/2;
        int ans = 0;

        for(int i=0, j=mid; i<mid; i++, j++){
            if(vowels.indexOf(s.charAt(i)) >=0) ans++;
            if(vowels.indexOf(s.charAt(j)) >=0) ans--;
        }
        return ans ==0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String_halves obj = new String_halves();
        System.out.println(obj.halvesAreAlike(sc.next()));
    }
}
