/*
Given a binary array nums, you should delete one element from it.

Return the size of the longest non-empty subarray containing only 1's in the resulting array. Return 0 if there is no such subarray.

 

Example 1:

Input: nums = [1,1,0,1]
Output: 3
Explanation: After deleting the number in position 2, [1,1,1] contains 3 numbers with value of 1's.
*/

class Solution {
    public int longestSubarray(int[] nums) {
        ArrayList<Integer> al = new ArrayList<>();
        int count = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                al.add(count);
                count = 0;
            }else{
                count++;
            }
        }
        if(count>0){
            al.add(count);
        }
        if(al.size()==1){
            return count-1;
        }
        int ans = -1;
        for(int i=0;i<al.size()-1;i++){
            ans = Math.max(ans,al.get(i)+al.get(i+1));
        }
        return ans;
    }
}
