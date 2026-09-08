//https://leetcode.com/problems/count-commas-in-range/?envType=daily-question&envId=2026-09-08


import java.util.*;
public class Count_Commas {
    public int countCommas(int n) {
        if(n<1000) return 0;
        return (n-1000) + 1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Count_Commas obj = new Count_Commas();
        System.out.println(obj.countCommas(n));
    }
}

