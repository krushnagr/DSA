class Solution
{
    public boolean isWordExist(char[][] board, String word)
    {
        // Code here
        // int a = 0;
        // System.out.println(word.charAt(a));
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[i].length;j++){
                if(word.charAt(0)==board[i][j] && help(board,word,i,j,0)){
                    return true;
                }
            }
        }
        return false;
    }
    // int len=0;
    boolean help(char[][] board, String word,int i,int j,int a){
        if(a==word.length()){
            return true;
        }
        if(i<0 || j<0 || i>=board.length || j>= board[0].length){
            return false;
        }
        if(board[i][j]!=word.charAt(a)){
            return false;
        }
        board[i][j] = '*';
        return help(board,word,i-1,j,a+1) ||
            help(board,word,i,j+1,a+1) ||
            help(board,word,i+1,j,a+1) ||
            help(board,word,i,j-1,a+1);
    }
}
