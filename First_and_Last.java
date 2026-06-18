  //https://leetcode.com/problems/fingitd-first-and-last-position-of-element-in-sorted-array/description/
  
  import java.util.*;

    public class First_and_Last {
        static int findLeftMost(int[] nums, int target){
            int start = 0;
            int end = nums.length-1;
            int left_most = -1;

            while(start<=end){
                int mid = start + (end-start)/2;
                if(target == nums[mid]){
                    left_most = mid; //possible answer
                    end = mid-1; //look more on left
                }else if(nums[mid] > target){
                    end = mid-1;
                }else{
                    start = mid+1;
                }
            }
            return left_most;
        }
        static int findRightMost(int[] nums, int target){
            int start = 0;
            int end = nums.length-1;
            int right_most = -1;

            while (start<=end){
                int mid = start + (end-start)/2;
                if(target == nums[mid]){
                    right_most = mid; //possible answer
                    start = mid+1; // look more on right
                }else if(nums[mid] > target){
                    end = mid-1;
                }else{
                    start = mid+1;
                }
            }
            return right_most;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[] nums = new int[n];
            for(int i=0; i<n; i++){
                nums[i] = sc.nextInt();
            }
            int target = sc.nextInt();
            int left_most = findLeftMost(nums, target);
            int right_most = findRightMost(nums, target);
            
            int[] ans = {left_most, right_most};
            System.out.println(Arrays.toString(ans));

        }
    }
