class Solution{
    static String longestPalin(String S){
        // code here
        String ans = "";
        int length = 0;
        for(int i=0;i<S.length();i++){
            String str = isPal(S,i,i);
            if(str.length()>length){
                length = str.length();
                ans = str;
            }
            str = isPal(S,i,i+1);
            if(str.length()>length){
                length = str.length();
                ans = str;
            }
        }
        return ans;
    }
    static String isPal(String s,int i,int j){
        while(i>=0 && j<s.length()){
            if(s.charAt(i)==s.charAt(j)){
                i--;
                j++;
            }else{
                break;
            }
        }
        return s.substring(i+1,j);
    }
}
