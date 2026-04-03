
import java.util.*;

public class Main {
    List<List<Integer>> threeSum(int[] nums,int target){
       Arrays.sort(nums);
       List<List<Integer>> al=new ArrayList<>();
       for(int i=0;i<nums.length;i++){
           if(i>0 && nums[i]==nums[i-1]) continue;
           for(int j=i+1;j<nums.length;j++){
               if(j!=i+1 && nums[j]==nums[j-1])continue;
               int k=j+1,l=nums.length-1;
               while(k<l){
                   int sum=nums[i]+nums[j]+ nums[k]+nums[l];
                   if(sum==target){
                       ArrayList<Integer> a=new ArrayList<>();
                       a.add(nums[i]);
                       a.add(nums[j]);
                       a.add(nums[k]);
                       a.add(nums[l]);
                       al.add(a);
                       k++;l--;
                       while(k<l && nums[k]==nums[k+1]) k++;
                       while(k<l && nums[l]==nums[l-1]) l--;
                   }
                   else if(sum>target){
                       l--;
                   }
                   else{
                       k++;
                   }
               }
           }
       }
       return al;
    }

    public static void main(String[] args) {
        Main m=new Main();

    int[] arr={1, -2, 3, 5, 7, 9};
    int target=7;
    System.out.println((m.threeSum(arr,target)));



    }
}