package org.example;

import java.util.ArrayList;
import java.util.List;

public class RepeatingAndMissingNumber {
    static int giveBitValue(int x,int bitNumber){
        x=x>>bitNumber;
        return (x&1);
    }
    static int findXorBit(int n){
        int bitNumber=0;
        while(n>0){
            if((n&1)==1){
                return bitNumber;
            }
            bitNumber++;
            n=n>>1;
        }
        return -1;
    }
   List<Integer> findNumbers(int[] arr){
   //find the xor with the array elements  and with the elements between 1 to n
       int xorValue=0;
       for(int i=0;i<arr.length;i++){
           xorValue=xorValue^arr[i];
           xorValue=xorValue^(i+1);
       }
      // System.out.println("the xor value is " + xorValue);
       //now we got the value, of the missing xor repeated, present in the xorValue variable
       //now find the bit in which the both are different , i,e value 1;
       int bitDiffNumber=RepeatingAndMissingNumber.findXorBit(xorValue);
      // System.out.println("the diffent bit Number is "+ bitDiffNumber);
       int xorZero=0,xorOne=0;
       for(int i=0;i<arr.length;i++){
           int identifyGroup=giveBitValue(arr[i],bitDiffNumber);
           if(identifyGroup==0){
               xorZero=xorZero^arr[i];
           }
           else{
               xorOne=xorOne^arr[i];
           }
       }
       //now performing the xor operation for the indexes , the number of elements
       for(int i=1;i<=arr.length;i++){
           int identifyGroup=giveBitValue(i,bitDiffNumber);
           if(identifyGroup==0){
               xorZero=xorZero^i;
           }
           else{
               xorOne=xorOne^i;
           }
       }
      // System.out.println("the numbers are "+ "Xor One:  "+ xorOne+"  Xor Zero:  "+ xorZero );
       int missing=-1,repeated=-1;
       for(int i=0;i<arr.length;i++){
           if(arr[i]==xorZero){
               repeated=xorZero;
               missing=xorOne;
               break;
           }
           if(arr[i]==xorOne){
               repeated=xorOne;
               missing=xorZero;
               break;
           }
       }
       ArrayList<Integer> al=new ArrayList<>();
       al.add(repeated);
       al.add(missing);
       return al;



        //return null;
   }
    public static void main(String a[]){
        int[] arr={3, 5, 4, 1, 1};
        RepeatingAndMissingNumber ramp=new RepeatingAndMissingNumber();
        System.out.println(ramp.findNumbers(arr));
    }
}
