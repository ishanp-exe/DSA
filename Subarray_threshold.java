//https://leetcode.com/problems/number-of-sub-arrays-of-size-k-and-average-greater-than-or-equal-to-threshold/description/

import java.util.*;
public class Subarray_threshold {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int sum =0, count =0;
        for(int i=0; i<k; i++){
            sum += arr[i];
        }
        if(sum/k >= threshold) count++;

        for(int i=k; i<arr.length; i++){
            sum = sum - arr[i-k] + arr[i];
            if(sum/k >= threshold) count++;
        }
        return count;
    }
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int k = sc.nextInt();
        int threshold = sc.nextInt();
        Subarray_threshold obj = new Subarray_threshold();
        System.out.println(obj.numOfSubarrays(arr, k, threshold));
        sc.close();
    }
}
