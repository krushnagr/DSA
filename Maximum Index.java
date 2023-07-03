/*
Given an array arr[] of n positive integers. The task is to find the maximum of j - i subjected to the constraint of arr[i] <= arr[j].

Input:
n = 9
arr[] = {34, 8, 10, 3, 2, 80, 30, 33, 1}
Output: 
6
Explanation: 
In the given array arr[1] < arr[7]  satisfying 
the required condition (arr[i] <= arr[j])  thus 
giving the maximum difference of j - i which is
6(7-1).

*/

class Solution {

    int maxIndexDiff(int arr[], int n) {
        // code here
        int ans = 0;
        int right[] = new int[n];
        int left[] = new int[n];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i=n-1;i>=0;i--){
            max =  Math.max(arr[i],max);
            right[i] =max;
        }
        for(int i=0;i<n;i++){
            min =  Math.min(arr[i],min);
            left[i] = min;
        }
        int j=0;
        int i=0;
        while(i<n&&j<n){
            if(left[i]<=right[j]){
                ans = Math.max(ans,j-i);
                j++;
            }else{
                i++;
            }
        }
        return ans;
    }
}
