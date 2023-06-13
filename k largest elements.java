
class Solution {
    int[] kLargest(int[] arr, int n, int k) {
        // code here
        Arrays.sort(arr);
        int ans[] = new int[k];
        int i=0;
        while(i<k){
            ans[i] = arr[n-1-i];
            i++;
        }
        return ans;
    }
}
