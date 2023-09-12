/*********************
A string s is called good if there are no two different characters in s that have the same frequency.

Given a string s, return the minimum number of characters you need to delete to make s good.

The frequency of a character in a string is the number of times it appears in the string. For example, in the string "aab", the frequency of 'a' is 2, while the frequency of 'b' is 1.

 

Example 1:

Input: s = "aab"
Output: 0
Explanation: s is already good.
*****************/

class Solution {
    public int minDeletions(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        // int dp[] = new int[map.size()];
        // Arrays.fill(dp,-1);
        ArrayList<Integer> al = new ArrayList<>();
        int ans = 0;
        for(Map.Entry<Character,Integer> entry : map.entrySet()){
            int idx = entry.getValue();
            if(!al.contains(idx)){
                al.add(idx);
            }else{
                for(int i=idx-1;i>=0;i--){
                    
                    if(!al.contains(i)){
                        al.add(i);
                        ans += idx-i;
                        break;
                    }
                    else if(i==0){
                        ans += idx-i;
                    }
                }
            }
        }
        return ans;
    }
}
