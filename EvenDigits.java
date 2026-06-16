//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/

import java.util.*;

public class EvenDigits {
    static int even(int[] arr){
        int count = 0;
        for(int i=0; i<arr.length; i++){
            int a = arr[i];
            int digits = 0;
            if(a == 0){
                digits = 1;
            }
            while(a>0){
                a = a/10;
                digits++;
            }
            if(digits%2 ==0){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //size of array
        int[] arr = new int[n]; //array initialization
        for(int i=0; i<n;  i++){ 
            arr[i]=sc.nextInt(); //array element input
        }
        System.out.println(even(arr));
    }
}
