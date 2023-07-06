/*
Quick Sort is a Divide and Conquer algorithm. It picks an element as a pivot and partitions the given array around the picked pivot.
Given an array arr[], its starting position is low (the index of the array) and its ending position is high(the index of the array).

Note: The low and high are inclusive.

Implement the partition() and quickSort() functions to sort the array.

Example 1:

Input: 
N = 5 
arr[] = { 4, 1, 3, 9, 7}
Output:
1 3 4 7 9
*/

class Solution
{
    //Function to sort an array using quick sort algorithm.
    static void quickSort(int arr[], int low, int high)
    {
        // code here
        if(low<high){
            int par = partition(arr,low,high);
            quickSort(arr,low,par-1);
            quickSort(arr,par+1,high);
        }
    }
    static int partition(int arr[], int low, int high)
    {
        // your code here
        int pivot = arr[high];
        int i=low-1;
        for(int j=low;j<high;j++){
            if(arr[j]<pivot){
                i++;
                int tem = arr[j];
                arr[j] = arr[i];
                arr[i] = tem;
            }
        }
        int tem = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = tem;
        return i+1;
    } 
}
