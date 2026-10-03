//https://leetcode.com/problems/longest-valid-parentheses/?envType=daily-question&envId=2026-10-03

import java.util.Scanner;
public class Long_Valid_Parentheses {
    public int longestValidParentheses(String s) {
        int n = s.length();
        int open = 0, close = 0, result = 0;

        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '(') open++;
            else close++;

            if (open == close) {
                result = Math.max(result, open + close);
            } else if (close > open) {
                open = close = 0;
            }
        }

        open = 0;
        close = 0;

        for (int i = n - 1; i >= 0; i--) {
            if (s.charAt(i) == '(') open++;
            else close++;

            if (open == close) {
                result = Math.max(result, open + close);
            } else if (open > close) {
                open = close = 0;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        Long_Valid_Parentheses solution = new Long_Valid_Parentheses();
        System.out.println(solution.longestValidParentheses(s));
    }
}
