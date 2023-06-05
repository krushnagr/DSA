
class Solution
{
    //Function to find the least absolute difference between any node
    //value of the BST and the given integer.
    // static int ans = Integer.MAX_VALUE;
    static int minDiff(Node  root, int K) 
    { 
        // Write your code here
        if(K==root.data){
            return 0;
        }
        
        return hel(root,K);
    }
    static int hel(Node root, int K){
        if(root==null){
            return Integer.MAX_VALUE;
        }
        if(root.data==K){
            // ans = 0;
            return 0;
        }
        // ans = Math.min(ans,Math.abs(root.data-K));
        if(K>root.data){
            return Math.min(Math.abs(root.data-K),hel(root.right,K));
        }
        return Math.min(Math.abs(root.data-K),hel(root.left,K));
    }
}

