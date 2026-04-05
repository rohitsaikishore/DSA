
public class MooresVoting {
    int findElement(int[] arr){
        int count=0,element=-1;
        for(int i=0;i<arr.length;i++){
            if(count==0){
                element=arr[i];
            }
            if(arr[i]==element){
                ++count;
            }
            else{
                --count;
            }
        }
        return element;
    }
    public static void main(String a[]){
        int[] arr={7, 0, 0, 1, 7, 7, 2, 7, 7};
        MooresVoting mv=new MooresVoting();
        System.out.println(mv.findElement(arr));
    }
}
