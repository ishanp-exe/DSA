//https://leetcode.com/problems/top-k-frequent-elements/

import java.util.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Top_K_Freq_Elements {
    public int[] topKFrequent(int[] nums, int k) {
        // count freq of each number
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int element:nums){
            map.put(element, map.getOrDefault(element,0)+1);
        }

        //converting hashmap into list
        ArrayList<Map.Entry<Integer, Integer>> arr = new ArrayList<>(map.entrySet());

        //sort by freq in desc order
        arr.sort((a,b)->b.getValue()-a.getValue());

        //picking first k elements
        int[] last = new int[k];
        for(int i=0; i<k; i++){
            last[i] = arr.get(i).getKey();
        }
        return last;
    }
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        
        Top_K_Freq_Elements obj = new Top_K_Freq_Elements();
        int[] result = obj.topKFrequent(nums, k);

        System.out.println(Arrays.toString(result));
    }

}
