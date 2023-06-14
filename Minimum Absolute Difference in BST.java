/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int min = Integer.MAX_VALUE;
    public int getMinimumDifference(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        ArrayList<Integer> que = new ArrayList<>();
        q.add(root);
        while(!q.isEmpty()){
            int size = q.size();
            for(int i = 0; i < size; i++){
                TreeNode tem = q.poll();
                que.add(tem.val);
                if(tem.left != null) q.add(tem.left);
                if(tem.right != null) q.add(tem.right);
            }
        }
        
        Collections.sort(que);
        for(int i = 0; i < que.size() - 1; i++){
            min = Math.min(que.get(i + 1) - que.get(i), min);
        }
        // hel(root);
        return min;
    }
}
