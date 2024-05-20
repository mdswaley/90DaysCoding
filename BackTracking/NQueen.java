package BackTracking;

public class NQueen {
    public static boolean isSafe(char board[][],int row,int col){
        //vertical check
        for(int i=row-1;i>=0;i--){
            if (board[i][col]=='Q') {
                return false;
            }
        }
        //digonal left
        for(int i=row-1,j = col-1;i>=0 && j>=0;i--,j--){
            if (board[i][j]=='Q') {
                return false;
            }
        }

        //digonal right
        for(int i=row-1,j=col+1;i>=0 && j<board.length;i--,j++){
            if (board[i][j]=='Q') {
                return false;
            }
        }
        return true;
    }
    public static void NQueenCall(char board[][],int row){
        //base case
        if (row == board.length) {
            printQueen(board);
            count++;
            return;
        }
        //coloum loop
        for(int j=0;j<board.length;j++){
            if(isSafe(board,row,j)){
                board[row][j]='Q';
                NQueenCall(board, row+1);//function call
                board[row][j]='.';//backTracking
            }
            
        }
    }
    public static void printQueen(char board[][]){
        System.out.println(".............Board..........");
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
    static int count=0;
    public static void main(String[] args) {
        int n = 4;
        char board[][] = new char[n][n];

        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                board[i][j]='.';
                // System.out.print(board[i][j]+" ");
            }
            // System.out.println();
        }
        NQueenCall(board,0);
        System.out.println("The Number Of ways: "+count);
    }
    
}
