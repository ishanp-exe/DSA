//https://leetcode.com/problems/maximum-number-of-words-found-in-sentences/

import java.util.*;
public class Maximum_Words {
    public int mostWordsFound(String[] sentences) {
        int max=0;
        for(String s:sentences){
            int words = 1;
            for(char ch : s.toCharArray()){
                if(ch == ' '){
                    words++;
                }
            }
            max = Math.max(max,words);
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] sentences = new String[n];
        for (int i = 0; i < n; i++) {
            sentences[i] = sc.nextLine();
        }
        Maximum_Words obj = new Maximum_Words();
        System.out.println(obj.mostWordsFound(sentences));
    }
}
