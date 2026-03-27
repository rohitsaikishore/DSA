#include<bits/stdc++.h>
using namespace std;

/*
Given an integer array nums sorted in non-decreasing order, remove all duplicates in-place so that each unique element appears only once.
Return the number of unique elements in the array.
If the number of unique elements be k, then,

Change the array nums such that the first k elements of nums contain the unique values in the order that they were present originally.
The remaining elements, as well as the size of the array does not matter in terms of correctness.
The driver code will assess correctness by printing and checking only the first k elements of the modified array.


An array sorted in non-decreasing order is an array where every element to the right of an element is either equal to or greater in value than that element.
*/
int removeDuplicates(vector<int>&v){
    int i=0;
    for(int j=1;j<v.size();j++){
        if(v[i]==v[j]){
            continue;
        }
        else{
            v[++i]=v[j];
        }
    }
    return (i+1);
}
void print(vector<int>v){
    for(int i=0;i<v.size();i++){
        cout<<v[i]<<" ";
    }
}
int main(){
    int n;
    cin>>n;
    vector<int>v(n);
    for(int i=0;i<n;i++){
        cin>>v[i];
    }
    sort(v.begin(),v.end());
   cout<<removeDuplicates(v)<<endl<<endl;
    print(v);
    return 0;
}