/*****************
Given a Binary Search Tree (with all values unique) and two node values n1 and n2 (n1!=n2). 
Find the Lowest Common Ancestors of the two nodes in the BST.
Input:
              5
            /   \
          4      6
         /        \
        3          7
                    \
                     8
n1 = 7, n2 = 8
Output: 7
**********************/


class BST
{   
    //Function to find the lowest common ancestor in a BST. 
    HashMap<Node,Node> map = new HashMap<>();
    void preOrder(Node curr,Node pare){
        if(curr==null)return;
        map.put(curr,pare);
        if(curr.left!=null)preOrder(curr.left,curr);
        if(curr.right!=null)preOrder(curr.right,curr);
    }
    ArrayList<Node> al = new ArrayList<>();
	Node LCA(Node root, int n1, int n2)
	{
        // code here.  
        
        preOrder(root,null);
        Node N1 = root;
        Node N2 = root;
        int flag1 = 0;
        int flag2 = 0;
        while(true){
            if(flag1!=1){
                if(N1.data==n1){
                    flag1 = 1;
                }
                else if(N1.data>n1){
                    N1 = N1.left;
                }
                else{
                    N1 = N1.right;
                }
            }
            if(flag2!=1){
                if(N2.data==n2){
                    flag2 = 1;
                }
                else if(N2.data>n2){
                    N2 = N2.left;
                }
                else{
                    N2 = N2.right;
                }
            }
            if(flag1==1 && flag2==1)break;
        }
        al.add(N1);
        fillAr(N1);
        return find(N2);
    }
    void fillAr(Node n1){
        if(n1==null)return;
        al.add(map.get(n1));
        fillAr(map.get(n1));
    }
    Node find(Node n2){
        if(al.contains(n2))return n2;
        if(n2==null)return null;
        Node ans = find(map.get(n2));
        return ans;
    }
}
