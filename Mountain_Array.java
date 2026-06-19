//https://leetcode.com/problems/find-in-mountain-array/description/

import java.util.*;
public class Mountain_Array {
    
    static int findInMountainArray(int[]arr, int target){
        int n = arr.length;
        int idx = peakIndexinMountainArray(arr, 0, n-1);

        int result_idx = binarySeach(arr, 0, idx, target);
            if(result_idx != -1){
                return result_idx;
        }
        result_idx = reverseBinarySearch(arr, idx+1, n-1, target);
            return result_idx;
    }
    static int peakIndexinMountainArray(int[] arr, int l, int r){
        int mid;
        while(l<r){
         mid = l+(r-l)/2;
         if(arr[mid] < arr[mid+1]){
            l = mid+1;
         }else{
            r = mid;
         }
       }
       return l;
    }

    //Ascending order Binary Search
    static int binarySeach(int[] arr, int l, int r, int target){
        while(l<=r){
            int mid = l + (r-l)/2;
            if(arr[mid] == target){
                return mid;
            }else if(arr[mid] < target){
                l = mid+1;
            }else{
                r = mid-1;
            }
        }
        return -1;
    }

    //Descending order Binary Search
    static int reverseBinarySearch(int[] arr, int l, int r, int target){
        while(l<=r){
            int mid = l + (r-l)/2;
            if(arr[mid] == target){
                return mid;
            }else if(arr[mid] < target){
                r = mid-1;
            }else{
                l = mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i = 0; i < n; i++){
        arr[i] = sc.nextInt();
    }
    int target = sc.nextInt();

    System.out.println(findInMountainArray(arr, target));
}
}
