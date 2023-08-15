/**********************
Given an array A[] consisting of 0’s and 1’s. A flip operation is one in which you turn 1 into 0 and a 0 into 1. 
You have to do at most one “Flip” operation of any subarray. Formally, select a range (l, r) in the array A[], 
such that (0 ≤ l ≤ r < n) holds and flip the elements in this range to get the maximum ones in the final array. 
You can possibly make zero operations to get the answer.

Example 1:

Input:
N = 5
A[] = {1, 0, 0, 1, 0} 
Output:
4
***********************/

class Solution {

    public static int maxOnes(int a[], int n) {
        // Your code goes here
        int count=0,max=0,l=0,lmax=0,rmax=0;
        for(int i=0;i<n;i++){
            if(a[i]==0){
                count++;
            }
            else{
                count--;
            }
            if(count>max){
                max = count;
                lmax = l;
                rmax = i;
            }
            if(count<0){
                count = 0;
                l = i+1;
            }
        }
        if(max ==0)
        {
            return a.length;
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            if (i >= lmax && i <= rmax) {
                if (a[i] == 0) {
                    ans++;
                }
            } else {
                if (a[i] == 1) {
                    ans++;
                }
            }
        }
        return ans;
    }
}
