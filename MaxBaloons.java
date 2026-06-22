//https://leetcode.com/problems/maximum-number-of-balloons/description/

import java.util.Scanner;

public class MaxBaloons {
    static int maxNumberOfBalloons(String text) {
        int b = 0, a = 0, l = 0, o = 0, n = 0;

        for (char c : text.toCharArray()) {
            if (c == 'b') b++;
            else if (c == 'a') a++;
            else if (c == 'l') l++;
            else if (c == 'o') o++;
            else if (c == 'n') n++;
        }
        return Math.min(Math.min(b, a),
               Math.min(Math.min(l / 2, o / 2), n));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        System.out.println(maxNumberOfBalloons(text));
    }
}
