class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set seen = new HashSet();
        int rowLen = board.length;
        int colLen = board[0].length;
        
        for(int row = 0; row<rowLen; row++) {
            for (int col = 0; col< colLen; col++) {
                char number = board[row][col];
                if(number != '.') {
                    

                    String rk = number+"in row"+row;
                    String ck = number+"in col"+col;
                    String bk = number+"in block"+row/3+"-"+col/3;

                    if(
                        !seen.contains(rk) &&
                        !seen.contains(ck) &&
                        !seen.contains(bk)
                    ) {
                        seen.add(rk);
                        seen.add(ck);
                        seen.add(bk);
                    } else {
                        return false;
                    }
                }
            }
        }


        return true;
    }
}
/*
    - digits 1-9
    - no duplicates
    - each 3x3 sub grid contain 1-9

*/
