/*
Given an integer array of size n containing distinct values in the range from 0 to n (inclusive), return the only number missing from the array within this range.
*/
 int missingNumber(vector<int>& nums) {
        int n=nums.size();
        int xor1=0;
        int xor2=0;
        for(int i=0;i<nums.size();i++){
            xor2^=nums[i];
            xor1^=i;
        }
        xor1^=n;
        return (xor1^xor2);
    }