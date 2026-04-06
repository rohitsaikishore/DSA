package org.example;

import java.util.ArrayList;

public class InversionPairs {

    int merge(int[] arr,int low,int mid,int high){
        int count=0;
        int left=low,right=mid+1;
        ArrayList<Integer> al=new ArrayList<>();
        while(left<=mid && right<=high){
            if(arr[left]<=arr[right]){
                al.add(arr[left]);
                left++;
            }
            else{
                count=count+(mid-left+1);
                al.add(arr[right]);
                right++;
            }
        }
        while(left<=mid){
            al.add(arr[left]);
            left++;
        }
        while(right<=high){
            al.add(arr[right]);
            right++;
        }
        for(int i=low;i<=high;i++){
            arr[i]=al.get(i-low);
        }
        return count;
    }
    int  countPairs(int[] arr,int low,int high){

        int count=0;
        if(low>=high)return 0;
        int mid=(low+high)/2;
        count+=countPairs(arr,low,mid);
        count+=countPairs(arr,mid+1,high);
        count+=merge(arr,low,mid,high);
        return count;
    }
    public static void main(String a[]){
        int[] arr={2, 3, 7, 1, 3, 5};
        InversionPairs ip=new InversionPairs();
      //  ip.countPairs(arr,0,arr.length-1);
       System.out.println(ip.countPairs(arr,0,arr.length-1));
       // System.out.println(ip.count);
    }
}
