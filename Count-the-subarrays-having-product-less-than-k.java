Count the subarrays having product less than k

Given an array of positive numbers, the task is to find the number of possible contiguous subarrays having product less than a given number k.

Example 1:

Input : 
n = 4, k = 10
a[] = {1, 2, 3, 4}
Output : 
7
Explanation:
The contiguous subarrays are {1}, {2}, {3}, {4} 
{1, 2}, {1, 2, 3} and {2, 3} whose count is 7.

// 1sth solution
class Solution {
    
    public int countSubArrayProductLessThanK(long a[], int n, long k)
    {
        int count = 0;
        Arrays.sort(a);
        for(int i=0;i<n;i++){
            if(a[i]<k){
                count++;
                long num = a[i];
                for(int j=i+1;j<n;j++){
                    num *= a[j];
                    if(num<k){
                        count++;
                    }else{
                        break;
                    }
                }
            }
        }
        return count;
    }
}

// 2nd solution
class Solution {
    
    public int countSubArrayProductLessThanK(long a[], int n, long k)
    {
        long p=1;
        int ans=0,i=0,j=0;
        for(j=0; j<n ; j++)
        {
            p = p*a[j];
            while(p>=k && i<j)
            {
                p/=a[i];
                i++;
            }
            
            if(p<k)
            ans+= (j-i+1);
        
        }
        return ans;
    }
}
