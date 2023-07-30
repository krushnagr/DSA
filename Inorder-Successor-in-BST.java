/******************************
Given a BST, and a reference to a Node x in the BST. Find the Inorder Successor of the given node in the BST.
 

Example 1:

Input:
      2
    /   \
   1     3
K(data of x) = 2
Output: 3
*******************************/
class Solution
{
    // returns the inorder successor of the Node x in BST (rooted at 'root')
	public Node inorderSuccessor(Node root,Node x)
     {
          //add code here.
          Node data = null;
          while(root!=null){
              if(root.data<=x.data){
                  root = root.right;
              }else{
                  data = root;
                  root = root.left;
                  
              }
          }
          return data;
     }
}
