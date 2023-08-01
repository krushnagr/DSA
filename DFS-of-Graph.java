/****************
You are given a connected undirected graph. Perform a Depth First Traversal of the graph.
Note: Use a recursive approach to find the DFS traversal of the graph starting from the 0th vertex from left to right according to the graph.

*****************/


class Solution {
    // Function to return a list containing the DFS traversal of the graph.
    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        ArrayList<Integer> a = new ArrayList<>();
        boolean visited[] = new boolean[V];
        dfs(0,adj,visited,a);
        return a;
    }
    public void dfs(int v,ArrayList<ArrayList<Integer>> adj,boolean visited[],ArrayList<Integer> ans){
        visited[v] = true;
        ans.add(v);
        for(int next : adj.get(v)){
            if(!visited[next]){
                dfs(next,adj,visited,ans);
            }
        }
    }
}
