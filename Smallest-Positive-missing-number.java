/*********
You are given an array arr[] of N integers including 0. The task is to find the smallest positive number missing from the array.

Example 1:

Input:
N = 5
arr[] = {1,2,3,4,5}
Output: 6
Explanation: Smallest positive missing 
number is 6.
***********/

class Solution
{
    //Function to find the smallest positive number missing from the array.
    static int missingNumber(int arr[], int n)
    {
       
        // 1st method
        boolean dp[] = new boolean[n+1];
        for(int i=0;i<n;i++){
            if(arr[i]>=0 && arr[i]<=n){
                dp[arr[i]] = true;
            }
        }
        for(int i=1;i<=n;i++){
            if(!dp[i]){
                return i;
            }
        }
        return n+1;


        // 2nd method
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(arr[i],1);
        }
        for(int i=0;i<=n;i++){
            if(!map.containsKey(i+1)){
                return i+1;
            }
        }
        
        return -1;
    }
}
