
class Solution {
    public static int maxEqualSum(int N1,int N2,int N3, int[] S1, int[] S2, int[] S3) {
        // code here
         int ii = 0, j = 0 , k = 0, s1 = 0, s2 = 0, s3 = 0;
        for(int i = 0 ; i < N1 ; i++) s1 += S1[i];
        for(int i = 0 ; i < N2 ; i++) s2 += S2[i];
        for(int i = 0 ; i < N3 ; i++) s3 += S3[i];
        while(ii < N1 && j < N2 && k < N3){
            boolean flag = true;
            int min = Math.min(s1, Math.min(s2, s3));
            if(s1 > min){s1 -= S1[ii++];flag = false;}
            if(s2 > min) {s2 -= S2[j++];flag = false;}
            if(s3 > min) {s3 -= S3[k++];flag = false;}
            if(flag) return s1;
        }
        return 0;
    }
}
