class Solution {
    public boolean isValidSudoku(char[][] board) {


        // check row
        for(int i=0; i <9; i++){
            Set rowSet = new HashSet();
            for(int j=0; j<9; j++) {
                if(board[i][j] != '.' && !rowSet.add(board[i][j])){
                    return false;
                }
            }
        }

        // check column
        for(int i=0; i <9; i++){
            Set colSet = new HashSet();
            for(int j=0; j<9; j++) {
                if(board[j][i] != '.' && !colSet.add(board[j][i])){
                    return false;
                }
            }
        }

        //check  3 * 3 grid
        for(int i=0; i<9; i+=3){
            for(int j=0; j < 9; j+=3){
                if(!isGridValid(board, i, j)){
                    return false;
                }
            }
        }
        return true;
    }

    private boolean isGridValid(char[][] board,int row,int col){
        int maxRow = row+3;
        int maxCol = col+3;
        Set gridSet = new HashSet();

        for(int i = row; i < maxRow; i++){
            for(int j = col; j < maxCol; j++){
                if(board[i][j] != '.' && !gridSet.add(board[i][j])){
                    return false;
                }
            }
        }


        return true;
    }
}
