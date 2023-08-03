/*
Given a Directed Acyclic Graph (DAG) with V vertices and E edges, Find any Topological Sorting of that Graph.
*/

class Solution
{
    //Function to return list containing vertices in Topological order. 
    static int[] topoSort(int V, ArrayList<ArrayList<Integer>> adj) 
    {
        // add your code here
        int ans[] = new int[V];
        
        int indegree[] = new int[V];
        for(int i=0;i<V;i++){
            ArrayList<Integer> data = adj.get(i);
            for(int x : data){
                indegree[x]++;
            }
        }
        
        Queue<Integer> q = new LinkedList<>();
        for(int i=0;i<V;i++){
            if(indegree[i]==0){
                q.add(i);
            }
        }
        int s = 0;
        while(!q.isEmpty()){
            int curr = q.poll();
            ans[s] = curr;
            s++;
            for(int x : adj.get(curr)){
                indegree[x]--;
                if(indegree[x]==0){
                    q.add(x);
                }
            }
        }
        return ans;
    }
}
