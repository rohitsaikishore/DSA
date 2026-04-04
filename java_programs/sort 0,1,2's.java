import java.util.*;

public class Main {
    static void swap(int nums[],int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }

    void sortZeroOneTwo(int nums[]){
        //we will use the dutch national flag algorithm
        //initially we will use the 0 to low-1 , all zeros, low to mid-1 all ones, high+1 to n-1, all twos
        int low=0,mid=0, high=nums.length-1;
        while(mid<=high){
            if(nums[mid]==0){
                swap(nums,low,mid);
                low++;
                mid++;
            }
            else if(nums[mid]==1){
                mid++;
            }
            else{
                swap(nums,mid,high);

                high--;
            }
        }
    }

    public static void main(String[] args) {
        Main m=new Main();

    int[] arr={1, 1, 2, 2, 1, 0};
    m.sortZeroOneTwo(arr);
    System.out.println(Arrays.toString(arr));



    }
}