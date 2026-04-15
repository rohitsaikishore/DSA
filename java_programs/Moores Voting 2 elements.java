public class MajorityElement_II {
    int findElement(int[] arr){
        int count1=0,count2=0,element1=-1,element2=-1;
        for(int i=0;i<arr.length;i++){
            if(count1==0 && element2!=arr[i]){
                element1=arr[i];
                count1++;
            }
            else if(count2==0 && element1!=arr[i]){
                element2=arr[i];
                count2++;
            }
            else if(arr[i]==element1){
                count1++;
            }
            else if(arr[i]==element2){
                count2++;
            }
            else{
                count1--;
                count2--;
            }
        }
        System.out.println("element 1: "+ element1 + "   "+"element 2: "+ element2);
        return 0;
    }

    public static void main(String a[]){
        MajorityElement_II me=new MajorityElement_II();
        int[] arr={1, 2, 1, 1, 3, 2, 2};
        System.out.println(me.findElement(arr));

    }
}
