//https://leetcode.com/problems/majority-element-ii/

import java.util.*;
public class Majority_Element2 {
    public List<Integer> majorityElement(int[] nums) {
       int n = nums.length;
        int ele1=0 , ele2=0;
        int count1=0, count2=0;
        for(int num:nums){ //first loop for possible candidates
            if(num  == ele1){
                count1++;
            }else if(num == ele2){
                count2++;
            }else if(count1==0){
                ele1 = num; count1=1;
            }else if(count2==0){
                ele2 = num ; count2=1;
            }else{
                count1--; count2--;
            }
        }
        //second loop 
        count1 = count2 = 0;
        for(int num:nums){
            if(num == ele1) count1++;
            else if(num == ele2) count2++;
        }
        List<Integer> ans = new ArrayList<>();
        if(count1 > n/3) ans.add(ele1);
        if(count2 > n/3) ans.add(ele2);

          return ans;
    }
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        Majority_Element2 obj = new Majority_Element2();
        System.out.println(obj.majorityElement(nums));
        sc.close();
    }
}
