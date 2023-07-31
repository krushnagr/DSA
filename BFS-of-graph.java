/*********************

Given a directed graph. The task is to do Breadth First Traversal of this graph starting from 0.
Note: One can move from node u to node v only if there's an edge from u to v. Find the BFS traversal 
of the graph starting from the 0th vertex, from left to right according to the input graph. Also, you 
should only take nodes directly or indirectly connected from Node 0 in consideration.

**********************/

class Solution {
    // Function to return Breadth First Traversal of given graph.
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        ArrayList<Integer> ans = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();
        ans.add(0);
        q.add(0);
        boolean visited[] = new boolean[V];
        visited[0] = true;
        while(!q.isEmpty()){
            int curr = q.poll();
            for(int i=0;i<adj.get(curr).size();i++){
                int tem = adj.get(curr).get(i);
                if(!visited[tem]){
                    q.add(tem);
                    ans.add(tem);
                    visited[tem] = true;
                }
            }
        }
        return ans;
    }
}
