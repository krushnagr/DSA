/***************

Given a binary tree

struct Node {
  int val;
  Node *left;
  Node *right;
  Node *next;
}
Populate each next pointer to point to its next right node. If there is no next right node, the next pointer should be set to NULL.

Initially, all next pointers are set to NULL.

 

Example 1:
Input: root = [1,2,3,4,5,null,7]
Output: [1,#,2,3,#,4,5,7,#]
***************/

/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        Queue<Node> q = new LinkedList<>();
        if(root==null)return root;
        if(root.left!=null)q.add(root.left);
        if(root.right!=null)q.add(root.right);

        while(!q.isEmpty()){
            Node temp = q.poll();
            int n = q.size();
            if(temp.left!=null)q.add(temp.left);
            if(temp.right!=null)q.add(temp.right);
            for(int i=0;i<n;i++){
                Node curr = q.poll();
                temp.next = curr;
                temp = temp.next;
                if(curr.left!=null)q.add(curr.left);
                if(curr.right!=null)q.add(curr.right);
            }
        }
        return root;
    }
}
