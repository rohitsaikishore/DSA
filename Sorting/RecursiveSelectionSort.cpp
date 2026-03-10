#include<bits/stdc++.h>
using namespace std;

int findMin(int arr[],int n,int start,int end,int smallIndex){
    if(start==n) return smallIndex;
    if(arr[start]<arr[smallIndex])smallIndex=start;
    return findMin(arr,n,start+1,end,smallIndex);
}


void RecursiveSelectionSort(int arr[],int n,int start,int end,int smallIndex){
    //basecase
   if(start==n-1)return;

   int minIndex=findMin(arr,n,start,end,smallIndex);
   swap(arr[start],arr[minIndex]);
   RecursiveSelectionSort(arr,n,start+1,end,start+1);


}

int main(){
    int n;
    cin>>n;
    int arr[n];
    for(int i=0;i<n;i++){
        cin>>arr[i];
    }
    RecursiveSelectionSort(arr,n,0,n-1,0);
    for(int i=0;i<n;i++){
        cout<<arr[i]<<" ";
    }
}