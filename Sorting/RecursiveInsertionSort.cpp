#include<bits/stdc++.h>
using namespace std;
void RecursiveInsertionSort(int arr[],int n){
    if(n<=1){
        return ;
    }
    RecursiveInsertionSort(arr,n-1);
    int last=arr[n-1];
    int j=n-2;
    while(j>=0 && arr[j] > last){
        arr[j+1]=arr[j];
        j--;
    }
    arr[j+1]=last;
}
int main(){
    int n;
    cin>>n;
    int arr[n];
    for(int i=0;i<n;i++){
        cin>>arr[i];
    }
    RecursiveInsertionSort(arr,n);

    for(int i=0;i<n;i++){
        cout<<arr[i]<<" ";
    }
}