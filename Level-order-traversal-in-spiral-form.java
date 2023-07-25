/**************************
Given a binary tree and the task is to find the spiral order traversal of the tree.

Spiral order Traversal mean: Starting from level 0 for root node, for all the even levels 
we print the node's value from right to left and for all the odd levels we print the node's value from left to right. 

For below tree, function should return 1, 2, 3, 4, 5, 6, 7.

Input:
           10
         /     \
        20     30
      /    \
    40     60
Output: 10 20 30 60 40 

*****************************/

class Spiral
{
    //Function to return a list containing the level order 
    //traversal in spiral form.	
    ArrayList<Integer> findSpiral(Node root) 
    {
        // Your code here
        Deque<Node> q = new ArrayDeque<>();
        ArrayList<Integer> al =new ArrayList<>();
        q.add(root);
        int curr = 0;
        while(!q.isEmpty()){
            int n = q.size();
            for(int i=0;i<n;i++){
                if(curr%2==0){
                    Node tem = q.removeLast();
                    al.add(tem.data);
                    if(tem.right!=null)q.addFirst(tem.right);
                    if(tem.left!=null)q.addFirst(tem.left);
                    
                }else{
                    Node tem = q.removeFirst();
                    al.add(tem.data);
                    if(tem.left!=null)q.addLast(tem.left);
                    if(tem.right!=null)q.addLast(tem.right);
                }
            }
            curr++;
        }
        return al;
    }
}
