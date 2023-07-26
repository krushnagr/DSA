/**********************
Given a binary tree of size  N, a node, and a positive integer k., Your task is to complete the function kthAncestor(), 
the function should return the kth ancestor of the given node in the binary tree. If there does not exist any such ancestor then return -1.
Note: It is guaranteed that the node exists in the tree.
Example 1:
      1
    /   \
   2     3
  / \
4    5
Input:
K = 2 Node = 4
Output: 1
Explanation:
Since, K is 2 and node is 4, so we
first need to locate the node and
look k times its ancestors.
Here in this Case node 4 has 1 as his
2nd Ancestor aka the Root of the tree.
***********************/
/*
class Node {
    int data;
    Node left, right;
    
    public Node(int data){
        this.data = data;
    }
}
*/

class Solution
{
    public int kthAncestor(Node root, int k, int node)
    {
        //Write your code here
        preOrder(root,null);
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int n = q.size();
            for(int i=0;i<n;i++){
                Node tem =q.poll();
                if(tem.data==node){
                    return help(tem,k);
                }
                if(tem.left!=null)q.add(tem.left);
                if(tem.right!=null)q.add(tem.right);
            }
        }
        return -1;
    }
    int help(Node tem,int k){
        
        if(tem==null)return -1;
        if(k==0)return tem.data;
        Node par = map.get(tem);
        int n = help(par,k-1);
        return n;
    }
    HashMap<Node,Node> map = new HashMap<>();
    void preOrder(Node curr,Node pare){
        if(curr==null)return;
        map.put(curr,pare);
        if(curr.left!=null)preOrder(curr.left,curr);
        if(curr.right!=null)preOrder(curr.right,curr);
    }
}
