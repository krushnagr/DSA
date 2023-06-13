class Solution {
    public int equalPairs(int[][] grid) {
        HashMap<String,Integer> ma = new HashMap<>();
        for(int i=0;i<grid.length;i++){
            String str = "";
            for(int j=0;j<grid[0].length;j++){
                str += String.valueOf(grid[i][j]);
                str += "-";
            }
            ma.put(str,ma.getOrDefault(str,0)+1);
        }
        int count = 0;
        for(int i=0;i<grid.length;i++){
            String str = "";
            for(int j=0;j<grid[0].length;j++){
                str += String.valueOf(grid[j][i]);
                str += "-";
            }
            // System.out.println(str);
            if(ma.containsKey(str)){
                count += ma.get(str);
            }
        }
        return count;
    }
}
