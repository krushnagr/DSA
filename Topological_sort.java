class Solution
{
    //Function to return list containing vertices in Topological order. 
    static int[] topoSort(int v, ArrayList<ArrayList<Integer>> adj) 
    {
        // add your code here
        int ans[] = new int[v];
        int idx = 0;
        Queue<Integer> q = new LinkedList<>();
        int ndeg[] = new int[v];
        for(int i=0;i<v;i++){
            for(int x : adj.get(i)){
                ndeg[x]++;
            }
        }
        for(int i=0;i<v;i++){
            if(ndeg[i]==0){
                q.add(i);
            }
        }
        while(!q.isEmpty()){
            int u = q.poll();
            ans[idx++] = u;
            for(int x : adj.get(u))
            if(--ndeg[x]==0)
            q.add(x);
        }
        return ans;
    }
}
