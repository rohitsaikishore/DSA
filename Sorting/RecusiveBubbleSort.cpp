#include<bits/stdc++.h>
using namespace std;
void RecursiveBubbleSort(int arr[],int n,int start,int end){
    
    if(end==0)return ;
    if(start==end){
        RecursiveBubbleSort(arr,n,0,end-1);
        return;
    } 
 
    if(arr[start]>arr[start+1]){
        swap(arr[start],arr[start+1]);
    }
   RecursiveBubbleSort(arr,n,start+1,end);


}
int main(){
    int n;
    cin>>n;
    int arr[n];
    for(int i=0;i<n;i++){
        cin>>arr[i];
    }


    RecursiveBubbleSort(arr,n,0,n-1);
    for(int i=0;i<n;i++){
        cout<<arr[i]<<" ";
    }
}