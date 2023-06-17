class Solution {
    public int minOperations(int[] arr) {
        int count = 0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]<=arr[i-1]){
                count += arr[i-1]-arr[i]+1;
                arr[i] += arr[i-1]-arr[i]+1;
            }
        }
        return count;
    }
}
