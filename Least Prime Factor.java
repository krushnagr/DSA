class Solution
{
    public int[] leastPrimeFactor(int n)
    {
        // code here
        int arr[] = new int[n+1];
        // arr[0] = 1;
        arr[1] = 1;
        arr[2]=2;
        for(int i=3;i<=n;i++){
            arr[i] = hel(i);
        }
        return arr;
    }
    int hel(int n){
        int ans = n;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(isPrime(i) && n%i==0){
                ans = i;
                break;
            }
        }
        return ans;
    }
    boolean isPrime(int n){
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
