/*****************
Given two sorted arrays arr1[] and arr2[] of sizes n and m in non-decreasing order. Merge them in sorted order without using any extra space. 
Modify arr1 so that it contains the first N elements and modify arr2 so that it contains the last M elements.

Example 1:

Input: 
n = 4, arr1[] = [1 3 5 7] 
m = 5, arr2[] = [0 2 6 8 9]
Output: 
arr1[] = [0 1 2 3]
arr2[] = [5 6 7 8 9]
Explanation:
After merging the two 
non-decreasing arrays, we get, 
0 1 2 3 5 6 7 8 9.
*****************/

class Solution
{
    //Function to merge the arrays.
    public static void merge(long arr1[], long arr2[], int n, int m) 
    {
        // code here 
        long arr[] = new long[n+m];
        int i=0;int j=0;int k=0;
        while(i<n && j<m){
            if(arr1[i]<=arr2[j]){
                arr[k] = arr1[i];
                i++;
            }
            else{
                arr[k] = arr2[j];
                j++;
            }
            k++;
        }
        while(i<n){
            arr[k] = arr1[i];
            i++;
            k++;
        }
        while(j<m){
            arr[k] = arr2[j];
            j++;
            k++;
        }
        i=0;k=0;j=0;
        while(i<n){
            arr1[i] = arr[k];
            i++;
            k++;
        }
        while(j<m){
            arr2[j] = arr[k];
            k++;
            j++;
        }
    }
}
