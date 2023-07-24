/*********************
Given a Binary Tree, find Right view of it. Right view of a Binary Tree is set of nodes visible when tree is viewed from right side.

Right view of following tree is 1 3 7 8.

Input:
     10
    /   \
  20     30
 /   \
40  60 
Output: 10 30 60
**********************/

class Solution{
    //Function to return list containing elements of right view of binary tree.
    ArrayList<Integer> rightView(Node node) {
        //add code here.
        ArrayList<ArrayList<Integer>> map = new ArrayList<>();
        Queue<Node> q = new LinkedList<>();
        // int curr = 1;
        q.add(node);
        while(!q.isEmpty()){
            ArrayList<Integer> al = new ArrayList<>();
            int size = q.size();
            for(int i=0;i<size;i++){
                Node temp = q.poll();
                al.add(temp.data);
                if(temp.left!=null)q.add(temp.left);
                if(temp.right!=null)q.add(temp.right);
            }
            map.add(al);
            // curr++;
        }
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0;i<map.size();i++){
            ArrayList<Integer> al = map.get(i);
            ans.add(al.get(al.size()-1));
        }
        return ans;
    }
}

