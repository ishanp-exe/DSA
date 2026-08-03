//https://leetcode.com/problems/stone-game/description/?envType=daily-question&envId=2026-08-02

import java.util.*;
public class Stone_Game {
    public boolean stoneGame(int[] piles) {
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] =  sc.nextInt();
        }
        Stone_Game obj = new Stone_Game();
        System.out.println(obj.stoneGame(arr));
    }
}
