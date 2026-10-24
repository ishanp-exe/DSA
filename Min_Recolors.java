//https://leetcode.com/problems/minimum-recolors-to-get-k-consecutive-black-blocks/description/

import java.util.*;

public class Min_Recolors {
    public int minimumRecolors(String blocks, int k) {
        int count = 0;
        for (int i = 0; i < k; i++) {
            if (blocks.charAt(i) == 'W')
                count++;
        }
        int minCount = count;
        for (int i = k; i < blocks.length(); i++) {
            if (blocks.charAt(i - k) == 'W')
                count--; // outgoing
            if (blocks.charAt(i) == 'W')
                count++; // incoming char
            minCount = Math.min(minCount, count);
        }
        return minCount;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String blocks = sc.next();
        int k = sc.nextInt();
        Min_Recolors obj = new Min_Recolors();
        System.out.println(obj.minimumRecolors(blocks, k));
    }
}
