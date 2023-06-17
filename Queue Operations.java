class Geeks{
    
    // Function to insert element into the queue
    static void insert(Queue<Integer> q, int k){
        
        // Your code here
        q.add(k);
    }
    
    // Function to find frequency of an element
    // rteturn the frequency of k
    static int findFrequency(Queue<Integer> q, int k){
        
        // Your code here
        int count = 0;
        for(int i=0;i<q.size();i++){
            int n = q.poll();
            if(n==k)count++;
            q.add(n);
        }
        return count;
    }
    
}
