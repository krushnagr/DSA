class Solution {
    static long maxDiamonds(int[] A, int N, int K) {
        // code here
        PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
        // Arrays.sort(A);
        for(int i=0;i<N;i++){
            q.add(A[i]);
            // q.add(A[i]/2);
        }
        long ans = 0;
        for(int i=0;i<K;i++){
            int tem = q.poll();
            q.add(tem/2);
            ans += tem;
        }
        return ans;
    }
};
