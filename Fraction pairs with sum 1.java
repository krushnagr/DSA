/*******************
Given a list of N fractions, represented as two lists numerator and denominator, 
the task is to determine the count of pairs of fractions whose sum equals 1.
Input:
N = 4
numerator = [1, 2, 2, 8]
denominator = [2, 4, 6, 12]
Output:
2
********************/

class Solution {
    public static int countFractions(int n, int[] num, int[] arr) {
        // code here
        int count = 0;
        HashMap<Integer,HashMap<Integer,Integer>> map = new HashMap<>();
        for(int i=0;i<n;i++)
        {
            int x = num[i];
            int y = arr[i];
            int g = gcd(x,y);
            x /= g;
            y /= g;
            
            int xn = y-x;
            if(map.containsKey(xn) && map.get(xn).containsKey(y)){
                count += map.get(xn).get(y);
            }
            
            if(map.containsKey(x)){
                HashMap<Integer,Integer> ha = map.get(x);
                ha.put(y,ha.getOrDefault(y,0)+1);
            }else{
                HashMap<Integer,Integer> ha = new HashMap<>();
                ha.put(y,1);
                map.put(x,ha);
            }
        }
        return count;
    }
     static int gcd(int a,int b)
    {
        if(b==0)return a;
        return gcd(b,a%b);
    }
}
