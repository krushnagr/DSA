/**********************
Given a binary tree and a budget. Assume you are at the root of the tree(level 1), you need to maximise the count of leaf 
nodes you can visit in your budget if the cost of visiting a leaf node is equal to the level of that leaf node.

Example 1:

Input: 
                  10
                /    \
               8      2
             /      /   \
            3      3     6
                    \
                     4
and budget = 8
Output: 2
***************************/


/*
class Node {
    int data;
    Node left, right;
    
    public Node(int data){
        this.data = data;
    }
}
*/
class Solution{
    public int getCount(Node root, int bud)
    {
        //code here 
        int level = 1;
        Queue<Node> q = new LinkedList<>();
        
        if(root.left == null && root.right == null){
            if(bud>=1)return 1;
            else return 0;
        }
        
        q.add(root);
        PriorityQueue<Integer> qe = new PriorityQueue<>();
        while(!q.isEmpty()){
            int size = q.size();
            level++;
            for(int i=0;i<size;i++){
                Node temp = q.poll();
                if(temp.left!=null){
                    if(temp.left.left == null && temp.left.right == null){
                        qe.add(level);
                    }else{
                        q.add(temp.left);
                    }
                }
                if(temp.right!=null){
                    if(temp.right.left == null && temp.right.right == null){
                        qe.add(level);
                    }
                    else{
                        q.add(temp.right);
                    }
                }
            }
        }
        int sum = 0;
        int ans = 0;
        while(!qe.isEmpty()){
            sum += qe.poll();
            if(sum<=bud){
                ans++;
            }else{
                return ans;
            }
        }
        return ans;
    }
}
