//https://leetcode.com/problems/find-the-duplicate-number/description/
import java.util.*;
public class Duplicate_Number {
    static int findDuplicate(int[] arr){
        int i=0;
        while(i<arr.length){

            if(arr[i] != i+1){
                int correct = arr[i]-1;
            if(arr[i] != arr[correct]){
                swap(arr,i,correct);
            }else{
               return arr[i];
            }
          }else{
            i++;
          }
        }
        return -1;
    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
       arr [first] = arr[second];
       arr [second] =temp;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(findDuplicate(arr));
    }
}