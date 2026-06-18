//https://leetcode.com/problems/peak-index-in-a-mountain-array/description/

import java.util.*;
public class Peak_Index {

    static int PeakIndexInMountainArray(int[] arr){
        int start = 0;
        int end = arr.length -1;

        while(start < end){
            int mid = start + (end - start)/2;
            if(arr[mid] > arr[mid+1]){
                //you are in decreasing part of array
                //this may be the answer but we will look at left
                end = mid;
                //this is why we dont use end = mid-1 as it may be the answer
            }else{
                //you are in asceding part of array
                start = mid + 1; //because we know that mid+1 element is greater than mid element hence we ignore it
            }
        }
        //in the end start == end and pointing to the largest number because of the two checks above 
        //start and end are always trying to find max element in the above 2 checks
        //hence when they are pointing to just one element, that is the maximum because this is whagt checks say 
        
        return start; // or return end as both start and end are equal
    }
    
     static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

        while(start <= end){
            int mid = start + (end-start)/2; //update value of mid in loop
           if(target < arr[mid]){
            end = mid-1;
        }else if(target > arr[mid]){
            start = mid+1;
        }else{
            return mid;
        }
     }
     return -1;  
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //size of array
        int[] arr = new int[n]; //array initialization
        for(int i=0; i<n;  i++){ 
            arr[i]=sc.nextInt(); //array element input
        }
        System.out.println(PeakIndexInMountainArray(arr));
  }

}
