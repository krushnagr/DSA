/*************************
Your task is to implement  2 stacks in one array efficiently. You need to implement 4 methods.
push1 : pushes element into first stack.
push2 : pushes element into second stack.
pop1 : pops element from first stack and returns the popped element. If first stack is empty, it should return -1.
pop2 : pops element from second stack and returns the popped element. If second stack is empty, it should return -1.

push1(2)
push1(3)
push2(4)
pop1()
pop2()
pop2()
Output:
3 4 -1
*******************************/

class twoStacks
{
    int arr[];
    int size;
    int top1, top2;
    twoStacks()
    {
        size = 100; 
        arr = new int[100]; 
        top1 = -1; 
        top2 = size;
    }
    //Function to push an integer into the stack1.
    Stack<Integer> st1 = new Stack<>();
    Stack<Integer> st2 = new Stack<>();
    void push1(int x)
    {
     st1.push(x);
    }
    //Function to push an integer into the stack2.
    void push2(int x)
    {
       st2.push(x);
    }
    //Function to remove an element from top of the stack1.
    int pop1()
    {
        if(st1.isEmpty()){
            return -1;
        }
        return st1.pop();
    }
    //Function to remove an element from top of the stack2.
    int pop2()
    {
        if(st2.isEmpty()){
            return -1;
        }
        return st2.pop();
    }
}

