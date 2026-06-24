import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Numbers_Disappeared {
    static List<Integer>  findDisappearedNumbers(int[] arr){
        int i=0;
        while(i<arr.length){
            int correct = arr[i]-1;
            if(arr[i] != arr[correct]){
                swap(arr,i,correct);
            }else{
                i++;
            }
        }
        //just find missing number
        List<Integer> ans = new ArrayList<>();
        for(int idx=0; idx<arr.length; idx++){
            if(arr[idx] != idx+1){
                ans.add(idx+1);
            }
        }
        return ans;
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
        for(int i=0;  i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(findDisappearedNumbers(arr));
    }
}