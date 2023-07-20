/**********************
We are given an array asteroids of integers representing asteroids in a row.

For each asteroid, the absolute value represents its size, and the sign represents its direction (positive meaning right, negative meaning left). Each asteroid moves at the same speed.

Find out the state of the asteroids after all collisions. If two asteroids meet, the smaller one will explode. If both are the same size, both will explode. Two asteroids moving in the same direction will never meet.

 

Example 1:

Input: asteroids = [5,10,-5]
Output: [5,10]
Explanation: The 10 and -5 collide resulting in 10. The 5 and 10 never collide.
**************************/

class Solution {
    public int[] asteroidCollision(int[] arr) {
        Stack<Integer> stack = new Stack<>();

        for (int asteroid : arr) {
            while (!stack.isEmpty() && stack.peek() > 0 && asteroid < 0) {
                int top = stack.pop();
                if (Math.abs(top) > Math.abs(asteroid)) {
                    asteroid = top;
                } else if (Math.abs(top) == Math.abs(asteroid)) {
                    asteroid = 0; // Both asteroids explode
                    break;
                }
            }

            if (asteroid != 0) {
                stack.push(asteroid);
            }
        }

        int[] result = new int[stack.size()];
        for (int i = stack.size() - 1; i >= 0; i--) {
            result[i] = stack.pop();
        }

        return result;

    }
}
