// https://leetcode.com/problems/find-smallest-letter-greater-than-target/description/

import java.util.*;

public class Smallest_Letter {
    static char nextGreatestLetter(char[] letters, char target){
        int l = 0;
        int r = letters.length-1;

        while(l<=r){
            int mid = l + (r-l)/2;
            if(letters[mid] <= target){
                l = mid+1;
            }else{
                r = mid-1;
            }
        }
        return letters[l%letters.length];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[] letters = new char[n];
        for(int i = 0; i<n; i++){
          letters[i] = sc.next().charAt(0);
        }
        char target = sc.next().charAt(0);
        System.out.println(nextGreatestLetter(letters, target));
    }
}
