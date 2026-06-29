//https://leetcode.com/problems/number-of-strings-that-appear-as-substrings-in-word/description/?envType=daily-question&envId=2026-06-29
import java.util.*;

public class NumberOfStrings {
    public int numOfStrings(String[] patterns, String word) {
        int count=0;
        for(String pattern:patterns){
            if(word.contains(pattern)){
                count++;
            }
        }
        return count;
    }
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
     String[] patterns = new String[n];
      for (int i = 0; i < n; i++) {
            patterns[i] = sc.nextLine();
        }
        String word = sc.nextLine();
        NumberOfStrings obj = new NumberOfStrings();
        System.out.println(obj.numOfStrings(patterns, word) );
   }
}
