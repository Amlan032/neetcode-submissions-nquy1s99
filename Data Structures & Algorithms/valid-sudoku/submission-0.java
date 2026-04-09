class Solution {
    public boolean isValidSudoku(char[][] board) {
        int r = board.length;
        int c = board[0].length;
        //row check 
        for(int i=0;i<r;i++){
            if (!isValidRow(board,i,c)){
                return false;
            }
        }
        //column check 
        for(int i=0;i<c;i++){
            if(!isValidColumn(board,i,r)){
                return false;
            }
        }
        // grid check 
        for(int i=0;i<r;i+=3){
            for(int j=0;j<c;j+=3){
                if(!isValidGrid(board,i,j,r,c)){
                    return false;
                }
            }
        }
        return true;
    }

    private boolean isValidRow(char[][] board, int x, int c){
        HashSet<Character> hSet = new HashSet<>();
        for(int i=0;i<c;i++){
            if(!hSet.contains(board[x][i]) && board[x][i] >= '1' && board[x][i] <= '9'){
                hSet.add(board[x][i]);
            }
            else if(board[x][i] == '.'){
                continue;
            }
            else{
                return false;
            }
        }
        return true;
    }

    private boolean isValidColumn(char[][] board, int x, int r){
        HashSet<Character> hSet = new HashSet<>();
        for(int i=0;i<r;i++){
            if(!hSet.contains(board[i][x]) && board[i][x] >= '1' && board[i][x] <= '9'){
                hSet.add(board[i][x]);
            }
            else if(board[i][x] == '.'){
                continue;
            }
            else{
                return false;
            }
        }
        return true;
    }

    private boolean isValidGrid(char[][] board, int x, int y, int r, int c){
        HashSet<Character> hSet = new HashSet<>();
        for(int i=x;i<(x+3);i++){
            for(int j=y;j<(y+3);j++){
                if(!hSet.contains(board[i][j]) && board[i][j] >= '1' && board[i][j] <= '9'){
                    hSet.add(board[i][j]);
                }
                else if(board[i][j] == '.'){
                    continue;
                }
                else{
                    return false;
                }
            }
        }
        return true;
    }
}
