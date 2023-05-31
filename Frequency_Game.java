class Solution {
    // Function to find largest number with minimum frequency
    public static int LargButMinFreq(int arr[], int n) {
        // Your code here
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        int min = Integer.MAX_VALUE;
        int ans = Integer.MIN_VALUE;
        for(Map.Entry<Integer,Integer> e : map.entrySet()){
            int y = e.getValue();
            int x = e.getKey();
            if(min>=y){
                ans = Math.max(ans,x);
                min = y;
            }
        }
        return ans;
    }
}
