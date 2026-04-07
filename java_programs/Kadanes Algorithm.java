public class KadaneAlgo {
    static int findMax(int a,int b){
        if(a>b) return a;
        else return b;
    }
    int findSubArraySum(int[] arr){
        int globalSum= Integer.MIN_VALUE,sum=0,startIndex=-1,finalStartIndex=-1,finalendIndex=-1;
        for(int i=0;i<arr.length;i++){
            if(sum==0){
                startIndex=i;
            }
            sum+=arr[i];
            if(sum>globalSum){
                finalStartIndex=startIndex;
                finalendIndex=i;
                globalSum=sum;
            }
            if(sum<0){
                startIndex=i;
                sum=0;
            }
        }
        System.out.println("startIndex "+ " "+ finalStartIndex + "  "+ "end Index "+ "  "+ finalendIndex);
        return globalSum;
    }
    public static void main(String a[]){
        int[] arr={2, 3, 5, -2, 7, -4};
        KadaneAlgo ka=new KadaneAlgo();
        System.out.println(ka.findSubArraySum(arr));
    }
}
