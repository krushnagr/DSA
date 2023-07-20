/******************************
Given a string S consisting of lowercase Latin Letters. Return the first non-repeating character in S. If there is no non-repeating character, return '$'.

Example 1:

Input:
S = hello
Output: h
Explanation: In the given string, the
first character which is non-repeating
is h, as it appears first and there is
no other 'h' in the string.
***************************/


class Solution
{
    //Function to find the first non-repeating character in a string.
    static char nonrepeatingCharacter(String S)
    {
        //Your code here
        HashMap<Character,Integer> map = new HashMap<>();
        Queue<Character> q = new LinkedList<>();
        for(int i=0;i<S.length();i++){
            map.put(S.charAt(i),map.getOrDefault(S.charAt(i),0)+1);
            
        }
        for(int i=0;i<S.length();i++){
            if(map.get(S.charAt(i))==1){
                return S.charAt(i);
            }
        }
        return '$';
    }
}
